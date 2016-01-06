import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void should_appenMember_change_class_number(){
        Klass klass=new Klass(1);
        Student student=new Student("Tom",21,new Klass(2),1);
        klass.appenMember(student);
        assertThat(student.getKlass(),is(klass));
    }
    @Test
    public void should_assignLeader_change_leader_return_null_when_student_in_Klass(){
        int number=2;
        Klass klass=new Klass(number);
        Student student=new Student("Tom",21,new Klass(2),1);
        klass.appenMember(student);
        assertThat( klass.assignLeader(student),is(""));
    }
    @Test
    public void should_assignLeader_give_error_when_student_not_in_any_klass(){
        int number=1;
        Klass klass=new Klass(2);
        Student student=new Student("Tom",21,new Klass(null),1);
        assertThat(klass.assignLeader(student),is("It is not one of us."));
    }
    @Test
    public void should_assignLeader_give_error_when_student_in_other_klass(){
        int number=1;
        Klass klass=new Klass(number);
        Student student=new Student("Tom",21,new Klass(2),1);
        assertThat(klass.assignLeader(student),is("It is not one of us."));
    }
//    @Test
//    public void should_isIn_give_true_when_student_in_classes(){
//        int number=1;
//        List<Klass> klasses=new ArrayList<Klass>();
//        klasses.add(new Klass(1));
//        klasses.add(new Klass(2));
//        Klass klass=new Klass(number);
//        Student student=new Student("Tom",21,2,1);
//        assertThat(klass.(student,klasses),is("true"));
//    }
}
