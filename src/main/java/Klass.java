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

    public void assignLeader(Student student) {
        student.klass.leader="Y";
    }

    public String getleader() {
        return leader;
    }


}
