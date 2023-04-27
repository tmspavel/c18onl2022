package by.teachmeskills.springbootexample.exceptions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.http.HttpStatus;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ErrorView {

    String value();

    HttpStatus status() default HttpStatus.INTERNAL_SERVER_ERROR;
}
