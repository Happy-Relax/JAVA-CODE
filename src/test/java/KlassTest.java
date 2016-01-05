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
    public void should_appenMember_leader(){
        int number=1;
        Klass klass=new Klass(number);
        Student student=new Student("Tom",21,2,1);
        klass.appenMember(student);
        assertThat(student.klass.getleader(),is("N"));
    }
    @Test
    public void should_assignLeader_change_leader_return_null_when_student_in_Klass(){
        int number=1;
        Klass klass=new Klass(number);
        Student student=new Student("Tom",21,2,1);
        klass.appenMember(student);
        assertThat( klass.assignLeader(student),is(""));
    }
    @Test
    public void should_assignLeader_give_error_when_student_out_of_klass(){
        int number=1;
        Klass klass=new Klass(number);
        Student student=new Student("Tom",21,2,1);
        assertThat(student.klass.assignLeader(student),is("It is not one of us."));
    }
}
