package builder;

import java.util.Date;

public class User {

    private final int id;
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final Date birthday;
    private final int balance;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getBalance() {
        return balance;
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        this.birthday = builder.birthday;
        this.balance = builder.balance;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {

        private int id;
        private String name;
        private String surname;
        private String email;
        private String password;
        private Date birthday;
        private int balance;

        private Builder() {

        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withDate(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder withBalance(int balance) {
            this.balance = balance;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", balance=" + balance +
                '}';
    }
}
