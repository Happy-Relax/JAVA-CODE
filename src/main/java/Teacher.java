/**
 * Created by liujia on 1/5/16.
 */
public class Teacher extends Person{

    private Integer klass=null;

    public Teacher(String name, int age, int klass) {
        this(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        String klassString="Class "+this.klass+".";
        if(this.klass==null){
            klassString="No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach "+klassString;
    }

    public String introduceWith(Student student) {
        String teacherString="I don't teach "+student.getName()+".";
        if(student.getKlass()==this.klass){
            teacherString="I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. "+teacherString;
    }
}
