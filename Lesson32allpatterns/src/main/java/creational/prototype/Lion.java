package creational.prototype;

public class Lion extends Animal {

    private String name;
    private int age;
    private String environment;

    public Lion(String name, int age, String environment) {
        this.name = name;
        this.age = age;
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", environment='" + environment + '\'' +
                '}';
    }

    @Override
    public Animal copy() {
        Lion lion = new Lion(this.name, this.age, this.environment);
        return lion;
    }

}
