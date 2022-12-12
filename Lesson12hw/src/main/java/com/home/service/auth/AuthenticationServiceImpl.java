package com.home.service.auth;

import com.home.exception.WrongLoginException;
import com.home.exception.WrongPasswordException;

import static com.home.util.Constants.PATTERN_LOGIN;
import static com.home.util.Constants.PATTERN_PASSWORD;

public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception {
        if (!login.matches(PATTERN_LOGIN)) {
            throw new WrongLoginException("В поле ЛОГИН введены некорректные данные");
        }
        if (!password.matches(PATTERN_PASSWORD)) {
            throw new WrongPasswordException("В поле ПАРОЛЬ введены некорректные данные");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
