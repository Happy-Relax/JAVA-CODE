import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by liujia on 1/5/16.
 */
public class KlassTest {
    @Test
    public void should_show_number(){
        int number=1;
        Klass klass=new Klass(number);
        assertThat(klass.getNumber(),is(1));
    }
    @Test
    public void should_assignLeader_leader(){
        int number=1;
        Klass klass=new Klass(number);
        klass.assignLeader("N");
        assertThat(klass.getleader(),is("N"));
    }
}
