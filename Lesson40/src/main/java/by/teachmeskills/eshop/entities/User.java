package by.teachmeskills.eshop.entities;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class User extends BaseEntity {

    private String name;
    private String surname;
    private String email;
    private String password;
    private Date birthday;
    private int balance;

    @Builder
    public User(int id, String name, String surname, String email, String password, Date birthday, int balance) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.balance = balance;
    }
}
