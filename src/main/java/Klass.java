/**
 * Created by liujia on 1/5/16.
 */
public class Klass {
    private Integer number=null;
    private Student leader=null;

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
        if(student.getKlass()==null){
            return "It is not one of us.";
        }
        else {
            if (!student.getKlass().equals(this)){
                return "It is not one of us.";
            }
            else{
                this.setLeader(student);
                return "";
            }
        }


    }

    public Student getleader() {
        return leader;
    }


    public void appenMember(Student student) {

        student.setKlass(this);
    }

    public void setNumber(Integer klassNumber) {
        this.number=klassNumber;

    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        if (number != null ? !number.equals(klass.number) : klass.number != null) return false;
        return leader != null ? leader.equals(klass.leader) : klass.leader == null;

    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        return result;
    }
}
