package by.teachmeskills;

import by.teachmeskills.soap.model.CountriesPort;
import by.teachmeskills.soap.model.GetCountryRequest;
import by.teachmeskills.soap.model.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner lookup(CountriesPort countryClient) {
        return args -> {
            String country = "Spain";
            GetCountryRequest getCountryRequest = new GetCountryRequest();
            getCountryRequest.setName(country);
            GetCountryResponse response = countryClient.getCountry(getCountryRequest);

            System.out.println(response.getCountry().getCurrency());
        };
    }
}
