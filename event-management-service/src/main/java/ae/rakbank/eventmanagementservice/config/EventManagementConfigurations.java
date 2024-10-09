package ae.rakbank.eventmanagementservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "rakbank.events")
public class EventManagementConfigurations {

    private int stopBookingsBeforeMinutes;

}
