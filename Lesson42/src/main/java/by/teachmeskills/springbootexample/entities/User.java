package by.teachmeskills.springbootexample.entities;

import by.teachmeskills.springbootexample.utils.PasswordConstraint;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class User extends BaseEntity {

    private String name;
    private String surname;
    private String email;
    @PasswordConstraint
    private String password;
    private Date birthday;
    private int balance;

}
