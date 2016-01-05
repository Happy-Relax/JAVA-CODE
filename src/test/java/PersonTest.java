import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by liujia on 1/5/16.
 */
public class PersonTest {
    @Test
    public void should_introduce_with_name_and_age(){
        String name="Tom";
        int age=21;
        Person person=new Person(name,age);
        assertThat(person.introduce(), is("My name is Tom. I am 21 years old."));

    }
    @Test
    public void should_show_id(){
        String name="Tom";
        int age=21;
        int id=1;
        Person person=new Person(name,age,id);
        assertThat(person.getId(), is(1));

    }
}

