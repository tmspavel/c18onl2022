package com.home;

import com.home.service.auth.AuthenticationService;
import com.home.service.auth.AuthenticationServiceImpl;

import java.util.List;

import static com.home.util.Constants.MIN_LOGIN_LENGTH;
import static com.home.util.Constants.PASSWORD_LENGTH;

public class HomeWork12 {

    public static void main(String[] args) {
        System.out.println("Длина поля логин установлена в - " + MIN_LOGIN_LENGTH);
        System.out.println("Длина поля пароль установлена в - " + PASSWORD_LENGTH);
        System.out.println();
        List<String[]> credentialsList = List.of(
                new String[]{"111", "222", "222"},
                new String[]{"111", "2", "222"},
                new String[]{"111", "222", "223"},
                new String[]{"1", "222", "222"},
                new String[]{"#11", "222", "222"},
                new String[]{" qw1", "222", "222"},
                new String[]{"qwqweqw#", "222", "222"},
                new String[]{"q^w", "222", "222"},
                new String[]{"q w", "222", "222"},
                new String[]{"q^w", "222", "222"},
                new String[]{"111", "_222", "_222"},
                new String[]{"111", "%222", "%222"},
                new String[]{"111", "2 22", "2 22"},
                new String[]{"111", " 222", " 222"},
                new String[]{"_111", "222", "222"},
                new String[]{"1111111111111111111111", "222", "222"},
                new String[]{"111", "222222222222222222222", "222"},
                new String[]{"2222222222222222222", "2222222222222222222", "2222222222222222222"}
        );

        AuthenticationService service = new AuthenticationServiceImpl();
        for (String[] credentials : credentialsList) {
            System.out.println("Логин: " + credentials[0] + "; Пароль: " + credentials[1] + "; Подтверждение пароля: " + credentials[2] + ";");
            try {
                System.out.println(service.checkAuthorization(credentials[0], credentials[1], credentials[2]) ? "Авторизация успешна" : "Авторизация отклонена");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
