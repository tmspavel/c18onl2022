package builder;

public class BuilderExampleApp {

    public static void main(String[] args) {
        User userWithNameAndSurnameOnly = User.newBuilder()
                                              .withName("Ivan")
                                              .withSurname("Ivanov")
                                              .build();
        System.out.println(userWithNameAndSurnameOnly);

        User userWithId = User.newBuilder()
                              .withId(1)
                              .build();
        System.out.println(userWithId);

        SimpleUser user = new SimpleUser()
                .email("sdf@mail.ru")
                .id(111)
                .surname("Ivanov")
                .name("Ivan");
        System.out.println(user.getId());
    }
}
