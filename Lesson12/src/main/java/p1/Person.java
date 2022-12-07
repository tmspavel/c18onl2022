package p1;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Person implements Cloneable, Testable {
    private String name;
    private int age;
    private Address address;

    @Override
    protected Person clone() {
        Person personClone;
        try {
            personClone = (Person) super.clone();
            personClone.address = address.clone();
            //System.exit(1);
        } catch (CloneNotSupportedException exception) {
            personClone = new Person(name, age, new Address(address.getCity()));
        } finally {
            System.out.println("asdsadas");
        }
        return personClone;
    }

    @Override
    public Double test() {
        return 0.0;
    }
}
