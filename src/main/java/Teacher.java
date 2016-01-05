/**
 * Created by liujia on 1/5/16.
 */
public class Teacher extends Person{

    private Klass klass=new Klass(null);

    public Teacher(String name, int age, int klass) {
        this(name, age);
        this.klass = new Klass(klass);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass, int id) {
        super(name, age, id);
        this.klass = new Klass(klass);
    }

    public String introduce() {
        String klassString="Class "+this.klass.getNumber()+".";
        if(this.klass.getNumber()==null){
            klassString="No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach "+klassString;
    }

    public String introduceWith(Student student) {
        String teacherString="I don't teach "+student.getName()+".";
        if(student.getKlassNumber()==this.klass.getNumber()){
            teacherString="I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. "+teacherString;
    }
}
