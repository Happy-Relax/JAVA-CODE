/**
 * Created by liujia on 1/5/16.
 */
public class Student {
    private final String name;
    private final int age;
    private final int klass;

    public Student(String name, int age, int klass) {
        this.name=name;
        this.age=age;
        this.klass=klass;
    }

    public String introudce() {
        return "My name is "+this.name+". I am "+this.age+" years old. I am a Student. I am at Class "+this.klass+".";
    }
}
