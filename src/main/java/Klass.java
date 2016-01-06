/**
 * Created by liujia on 1/5/16.
 */
public class Klass {
    private Integer number=null;
    private String leader=null;

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
        if(student.getKlassNumber()==null){
            return "It is not one of us.";
        }
        else {
            if (student.getKlassNumber()!=this.number){
                return "It is not one of us.";
            }
            else{
                student.setLeader("true");
                return "";
            }
        }


    }

    public String getleader() {
        return leader;
    }


    public void appenMember(Student student) {

        student.setKlassNumber(this.number);
    }

    public void setNumber(Integer klassNumber) {
        this.number=klassNumber;

    }

    public void setLeader(String leader) {
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
