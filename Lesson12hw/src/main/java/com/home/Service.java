package com.home;

import com.home.service.auth.AuthenticationService;
import lombok.AllArgsConstructor;

import java.util.function.Consumer;

@AllArgsConstructor
public class Service implements Consumer<String[]> {
    private AuthenticationService service;

    @Override
    public void accept(String[] credentials) {
        System.out.println("Логин: " + credentials[0] + "; Пароль: " + credentials[1] + "; Подтверждение пароля: " + credentials[2] + ";");
        try {
            System.out.println(service.checkAuthorization(credentials[0], credentials[1], credentials[2]) ? "Авторизация успешна" : "Авторизация отклонена");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
