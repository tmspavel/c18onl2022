package p1;

import lombok.Getter;
import lombok.Setter;

public class Practice7 {
    //Ссылки на конструкторы
    /*
    При использовании конструкторов методы функциональных интерфейсов должны принимать
     тот же список параметров,
     что и конструкторы класса, и должны возвращать объект данного класса.
     */
    public static void main(String[] args) {

//        Function<User, String> getName = User::getName;
//        System.out.println(getName.apply(new User("Nik", 23)));

        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName() + user.getAge());
//        value -> new User(value)
    }
}

@FunctionalInterface
interface UserBuilder {
    User create(String name);
}

@Getter
@Setter
//@AllArgsConstructor
class User {
    private final String name;
    private int age;

    public User(String name) {
        this.name = name;
//        this.age = age;
    }
}
