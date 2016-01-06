import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StudentTest {
    @Test
    public void should_introudce_with_name_age_and_klass(){
        String name="Tom";
        int age=21;
//        int number=2;
        Klass klass=new Klass(2);
        Student student=new Student(name,age,klass);
        assertThat(student.introudce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));

    }
    @Test
    public void should_show_id(){
        String name="Tom";
        int age=21;
//        int number=2;
        Klass klass=new Klass(2);
        int id=1;
        Student student=new Student(name,age,klass,id);
        assertThat(student.getId(),is(1));

    }
    @Test
    public void should_introudce_is_not_a_leader(){
        String name="Tom";
        int age=21;
        int id=1;
        Klass klass=new Klass(2);
        Student student=new Student(name,age,klass,id);

        klass.appenMember(student);

        assertThat(student.introudce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));

    }
    @Test
    public void should_introudce_is_a_leader(){
        String name="Tom";
        Klass klass=new Klass(2);
        Student student=new Student(name, 21,klass, 1);
        klass.appenMember(student);

        klass.assignLeader(student);

        assertThat(student.introudce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2. I am Leader of Class 2."));

    }
    @Test
    public void should_student_out_of_class(){
        Klass klassOne=new Klass(1);
        Klass klassTwo = new Klass(2);
        Student tom=new Student("Tom", 21, klassTwo, 1);

        klassOne.assignLeader(tom);

        assertThat(tom.introudce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));

    }


}
