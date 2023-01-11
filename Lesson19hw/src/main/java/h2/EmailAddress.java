package h2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailAddress {
    private String email; //электронный адрес
    private String someData; /*доп. информация для формирования письма.*/

    public EmailAddress(String email) {
        this.email = email;
    }
}
