/**
 * Created by liujia on 1/5/16.
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
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
}
