/**
 * Created by liujia on 1/5/16.
 */
public class Student extends Person{
    private int klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    public Student(String name, int age, int klass, int id) {
        super(name, age, id);
        this.klass=klass;
    }

    public String introudce() {
        return super.introduce()+" I am a Student. I am at Class "+this.klass+".";
    }

    public int getKlass() {
        return klass;
    }
}
