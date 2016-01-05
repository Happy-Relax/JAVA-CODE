/**
 * Created by liujia on 1/5/16.
 */
public class Person {

    private String name;
    private int age;
    private Integer id;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public String introduce() {
        return this.baseIntroduce();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String baseIntroduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public Integer getId() {
        return id;
    }
}
