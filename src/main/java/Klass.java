/**
 * Created by liujia on 1/5/16.
 */
public class Klass {
    private Integer number;
    private String leader="out";

    public Klass(int number) {
        this.number=number;
    }

    public Klass(Integer number) {
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

    public String assignLeader(Student student) {
        if(student.klass.leader!="out"){
            student.klass.leader="Y";
            return "";
        }
        else {
            return "It is not one of us.";
        }
    }

    public String getleader() {
        return leader;
    }


    public void appenMember(Student student) {
        student.klass.leader="N";
    }
}
