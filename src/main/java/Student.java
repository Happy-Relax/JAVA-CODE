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
        if(this.klass.getleader()=="true"){
            leaderString=" I am Leader of Class "+this.klass.getNumber()+".";
        }
        return super.introduce()+" I am a Student. I am at Class "+this.klass.getNumber()+"."+leaderString;
    }

    public Integer getKlassNumber() {
        return this.klass.getNumber();
    }


    public void setKlassNumber(Integer klassNumber) {
        this.klass.setNumber(klassNumber);
    }

    public void setLeader(String leader) {
        this.klass.setLeader(leader);
    }

    public Klass getKlass() {
        return this.klass;
    }
}
