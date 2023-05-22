package by.teachmeskills;

import by.teachmeskills.soap.model.CountriesPort;
import by.teachmeskills.soap.model.CountriesPortService;
import by.teachmeskills.soap.model.GetCountryRequest;
import by.teachmeskills.soap.model.GetCountryResponse;

public class Main {

    public static void main(String[] args) {
        CountriesPortService client = new CountriesPortService();
        CountriesPort service = client.getCountriesPortSoap11();


        String country = "Spain";
        GetCountryRequest getCountryRequest = new GetCountryRequest();
        getCountryRequest.setName(country);
        GetCountryResponse response = service.getCountry(getCountryRequest);

        System.out.println(response.getCountry().getCurrency());

    }

}
