package p1;

import lombok.Setter;
import lombok.ToString;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Practice7 {
    //Ссылки на конструкторы
    /*
    При использовании конструкторов методы функциональных интерфейсов должны принимать
     тот же список параметров,
     что и конструкторы класса, и должны возвращать объект данного класса.
     */
    public static void main(String[] args) {

        Function<User, String> getName = user -> user.getName();
        System.out.println(getName.apply(new User("Nik", 23)));

        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        BiFunction<String, Integer, User> aNew = User::new;
//        User ivan = userBuilder.create2("Ivan", 20);
        System.out.println(aNew.apply("Ivan", 20));
        System.out.println(user.getName() + user.getAge());
//        value -> new User(value)
    }
}

@FunctionalInterface
interface UserBuilder {
    User create(String name);
}

//@Getter
@Setter
//@AllArgsConstructor
@ToString
class User {
    private final String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name) {
        this.name = name;
//        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
