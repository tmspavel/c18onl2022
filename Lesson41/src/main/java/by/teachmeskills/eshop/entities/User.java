package by.teachmeskills.eshop.entities;

import by.teachmeskills.validator.PasswordConstraint;
import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "Email must not be empty")
    @Email(message = "Email must be valid")
    private String email;
    //    @Size(min = 6, max = 30, message = "Password must be between 6 and 30 characters")
//    @Pattern(regexp = "\\S+", message = "Spaces are not allowed")
    @PasswordConstraint
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
