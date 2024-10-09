package ae.rakbank.eventmanagementservice;

import ae.rakbank.eventmanagementservice.config.EventManagementConfigurations;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySources;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigurationProperties(EventManagementConfigurations.class)
@EnableRetry
@EnableFeignClients
public class EventManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManagementServiceApplication.class, args);

    }

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
