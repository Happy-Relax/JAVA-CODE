/**
 * Created by liujia on 1/5/16.
 */
public class Student extends Person{
    private Klass klass;


    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Student(String name, int age, Klass klass, int id) {
        super(name, age, id);
        this.klass=klass;
    }

    public String introudce() {
        String leaderString="";
        if(this.equals(this.klass.getleader())){
            leaderString=" I am Leader of Class "+this.klass.getNumber()+".";
        }
        return super.introduce()+" I am a Student. I am at Class "+this.klass.getNumber()+"."+leaderString;
    }


    public Klass getKlass() {
        return this.klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    
}
