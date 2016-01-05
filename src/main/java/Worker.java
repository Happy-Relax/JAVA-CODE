/**
 * Created by liujia on 1/5/16.
 */
public class Worker extends Person{


    public Worker(String name, int age) {
        super(name, age);

    }

    public Worker(String name, int age, int id) {
        super(name, age, id);
    }

    public String introduce() {
        return super.introduce()+" I am a Worker. I have a job.";
    }
}
