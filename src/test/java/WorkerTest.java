import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by liujia on 1/5/16.
 */
public class WorkerTest {
    @Test
    public void should_introduce_worker_name_and_age(){
        String name="Tom";
        int age=21;
        Worker worker=new Worker(name,age);
        assertThat(worker.introduce(),is("My name is Tom. I am 21 years old. I am a Worker. I have a job."));
    }
    @Test
    public void should_show_id(){
        String name="Tom";
        int age=21;
        int id=1;
        Worker worker=new Worker(name,age,id);
        assertThat(worker.getId(),is(1));
    }
}
