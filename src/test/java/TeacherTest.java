import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by liujia on 1/5/16.
 */
public class TeacherTest {
    @Test
    public void should_introduce_teacher_name_age_and_class(){
        String name="Tom";
        int age=21;
        int klass=2;
        Teacher teacher=new Teacher(name,age,klass);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));
    }
    @Test
    public void should_introduce_teacher_when_klass_is_null(){
        String name="Tom";
        int age=21;
        Teacher teacher=new Teacher(name,age);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_introduce_teacher_teach_student(){
        String name="Tom";
        int age=21;
        Klass klass=new Klass(2);
        Teacher teacher=new Teacher(name,age,2);
        Student student=new Student("Jerry",12,klass);
        assertThat(teacher.introduceWith(student),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."));
    }
    @Test
    public void should_introduce_teacher_not_teach_student(){
        String name="Tom";
        int age=21;
        Klass klass=new Klass(2);
        Teacher teacher=new Teacher(name,age,1);
        Student student=new Student("Jerry",12,klass);
        assertThat(teacher.introduceWith(student),is("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry."));
    }
    @Test
    public void should_show_id(){
        String name="Tom";
        int age=21;
        int id=1;
        Teacher teacher=new Teacher(name,age,1,id);
        assertThat(teacher.getId(),is(1));
    }
    @Test
    public void should_print_classes(){
        String name="Tom";
        int age=21;
        int id=1;
        List<Klass> klasses=new ArrayList<Klass>();
        klasses.add(new Klass(2));
        klasses.add(new Klass(3));
        Teacher teacher=new Teacher(name,age,klasses,id);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3."));
    }
    @Test
    public void should_print_no_class(){
        String name="Tom";
        int age=21;
        int id=1;
        List<Klass> klasses=new ArrayList<Klass>();
        Teacher teacher=new Teacher(name,age,klasses,id);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_isTeaching_return_true_when_teacher_teach_the_student(){
        List<Klass> klasses=new ArrayList<Klass>();
        Klass klassOne=new Klass(1);
        klasses.add(klassOne);
        Teacher teacher=new Teacher("Tom", 21,klasses, 1);
        Student student=new Student("Tom", 21,klassOne, 1);
        assertThat(teacher.isTeaching(student),is(true));
    }
    @Test
    public void should_isTeaching_return_false_when_teacher_not_teach_the_student(){
        List<Klass> klasses=new ArrayList<Klass>();
        Klass klassOne=new Klass(1);
        Klass klassTwo=new Klass(2);
        klasses.add(klassTwo);
        Teacher teacher=new Teacher("Tom", 21,klasses, 1);
        Student student=new Student("Tom", 21,klassOne, 1);
        assertThat(teacher.isTeaching(student),is(false));
    }
}

