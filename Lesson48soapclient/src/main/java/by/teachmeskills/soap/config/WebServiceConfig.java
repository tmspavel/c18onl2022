package by.teachmeskills.soap.config;

import by.teachmeskills.soap.model.CountriesPort;
import by.teachmeskills.soap.model.CountriesPortService;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class WebServiceConfig {

    @Bean
    public CountriesPort countryClient() {
        CountriesPortService client = new CountriesPortService();
        return client.getCountriesPortSoap11();
    }
}
