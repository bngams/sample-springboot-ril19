package fr.cesi.rila19.samplespringdemo.env;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // @Bean
@ConfigurationProperties(prefix="app.aws")
@Data
public class MapConfig {
    private String token; // app.aws.token
    // String urlWS; // app.urlWS
}
