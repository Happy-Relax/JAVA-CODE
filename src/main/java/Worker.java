/**
 * Created by liujia on 1/5/16.
 */
public class Worker extends Person{


    public Worker(String name, int age) {
        super(name, age);

    }

    public String introduce() {
        return this.baseIntroduce()+" I am a Worker. I have a job.";
    }
}
