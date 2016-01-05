import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StudentTest {
    @Test
    public void should_introudce_with_name_age_and_klass(){
        String name="Tom";
        int age=21;
        int klass=2;
        Student student=new Student(name,age,klass);
        assertThat(student.introudce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));

    }
    @Test
    public void should_show_id(){
        String name="Tom";
        int age=21;
        int klass=2;
        int id=1;
        Student student=new Student(name,age,klass,id);
        assertThat(student.getId(),is(1));

    }


}
