import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujia on 1/5/16.
 */
public class Teacher extends Person{

    private List<Klass> klasses=new ArrayList<Klass>();

    public Teacher(String name, int age, int klass) {
        this(name, age);
        this.klasses.add(new Klass(klass));
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass, int id) {
        super(name, age, id);
        this.klasses.add(new Klass(klass));
    }

    public Teacher(String name, int age, List<Klass> klasses, int id) {
        super(name, age, id);
        this.klasses=klasses;
    }

    public String introduce() {
        String klassesString="";
        for (int i=0;i<this.klasses.size();i++){
            klassesString+=" "+this.klasses.get(i).getNumber();
            if (i!=this.klasses.size()-1){
                klassesString+=",";
            }
        }
        String klassString="Class"+klassesString+".";
        if(this.klasses.size()==0){
            klassString="No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach "+klassString;
    }

    public String introduceWith(Student student) {
        String teacherString="I don't teach "+student.getName()+".";
        for (int i=0;i<this.klasses.size();i++){
            if(student.getKlassNumber()==this.klasses.get(i).getNumber()){
                teacherString="I teach "+student.getName()+".";
                break;
            }

        }
        return super.introduce()+" I am a Teacher. "+teacherString;
    }

    public Boolean isTeaching(Student student) {
        boolean teach_this_student=false;
        for (int i = 0; i<this.klasses.size(); i++){
            if (this.klasses.get(i).isIn(student)){
                teach_this_student=true;
                break;
            }
        }
        return teach_this_student;
    }
}
