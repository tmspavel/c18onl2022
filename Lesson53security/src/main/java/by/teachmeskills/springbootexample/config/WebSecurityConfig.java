package by.teachmeskills.springbootexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity(debug = true)
@EnableGlobalMethodSecurity(securedEnabled = true)
@ComponentScan(basePackages = "by")
@Configuration
public class WebSecurityConfig {

    /* CSRF (межсайтовая подделка запросов) — это вид атаки на сайт, которая производится с помощью мошеннического сайта
    или скрипта, который заставляет браузер пользователя выполнить нежелательное действие на доверенном сайте,
    на котором пользователь авторизован.
    Обычно для этого пользователь должен перейти по мошеннической ссылке (которая может быть изменена с помощью
    сокращателя ссылок).
    Например Джейн, авторизованная на сайте банка, проверяет свою почту. Она может перейти по фишинговой ссылке,
    которая включает запрос на перевод денег на аккаунт мошенника.
    Благодаря тому, что она авторизована на сайте банка, тот обработает запрос на перевод.*/
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeHttpRequests((authz) -> {
                                           try {
                                               authz.antMatchers("/resources/**", "/")
                                                    .permitAll()
                                                    .antMatchers("/order/**")
                                                    .authenticated()
                                                    .and()
                                                    .formLogin()
                                                    .loginPage("/login")
                                                    .usernameParameter("email")
                                                    .passwordParameter("password")
                                                    .permitAll()
                                                    .and()
                                                    .logout()
                                                    .invalidateHttpSession(true)
                                                    .clearAuthentication(true)
                                                    .permitAll();
                                           } catch (Exception e) {
                                               throw new RuntimeException(e);
                                           }
                                       }
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
