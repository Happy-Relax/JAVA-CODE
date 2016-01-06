import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test(){
       assertThat("Hello World",is("Hello World"));
       assertThat(new HelloWorld().beenCalled(),is("Hello World"));
    }

    @Test
    public void should_be_mocked(){
        HelloWorld helloWorld = mock(HelloWorld.class);
        when(helloWorld.beenCalled()).thenReturn("Leave me alone.");

        assertThat(helloWorld.beenCalled(), is("Leave me alone."));

        Student jerry=new Student("Jerry",21,new Klass(2),1);
        Student jim=new Student("Jim",21,new Klass(2),2);
        Klass klass = new Klass(2);
        klass.appenMember(jerry);
        klass.assignLeader(jerry);

        klass.assignLeader(jim);

        new Klass(1);
        new Klass(1);

        String a = null;
        System.out.println("a".equals(null));
    }
}
