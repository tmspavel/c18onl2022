package p1;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
//        System.out.println(a == b);
        Person person1 = new Person("Alex", 30, new Address("Minsk"));
        Person person2 = null;
        System.out.println(person2.getAge());
//        try {
        person2 = person1.clone();
//        } catch (CloneNotSupportedException exception) {
//            exception.printStackTrace();
//        }


        System.out.println(person1.getAddress() == person2.getAddress());

        System.out.println(person1.getAddress().equals(person2.getAddress()));
//        System.out.println(person1 == person2);
//        System.out.println(person1.equals(person2));

//        System.out.println(person1.equals(new int[]{1,2}));
//        System.out.println("----");
//        System.out.println(person1.hashCode());
//        System.out.println(person2.hashCode());
    }
}
