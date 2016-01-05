/**
 * Created by liujia on 1/5/16.
 */
public class Student extends Person{
    private final int klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    public String introudce() {
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Student. I am at Class "+this.klass+".";
    }
}
