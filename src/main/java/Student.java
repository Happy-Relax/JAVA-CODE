/**
 * Created by liujia on 1/5/16.
 */
public class Student extends Person{
    public Klass klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass=new Klass(klass);
    }

    public Student(String name, int age, int klass, int id) {
        super(name, age, id);
        this.klass=new Klass(klass);
    }

    public String introudce() {
        String leaderString="";
        if(this.klass.getleader()=="Y"){
            leaderString=" I am Leader of Class "+this.klass.getNumber()+".";
        }
        return super.introduce()+" I am a Student. I am at Class "+this.klass.getNumber()+"."+leaderString;
    }

    public int getKlassNumber() {
        return klass.getNumber();
    }


}
