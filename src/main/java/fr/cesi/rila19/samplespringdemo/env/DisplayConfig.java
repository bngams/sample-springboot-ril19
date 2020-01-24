package fr.cesi.rila19.samplespringdemo.env;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class DisplayConfig {

    // SpEL Spring Expression Language
    @Value("${app.aws.token}")
    private String awsToken;

    // interface Environment
    // Properties.getProperty
    @Autowired
    private Environment env;

    @Autowired
    private MapConfig mapEnv;

//    @Autowired
//    DisplayConfig(@Value("${app.aws.token}") String awsToken,
//        Environment env,
//        MapConfig mapEnv) {
//        this.awsToken = awsToken;
//        this.mapEnv = mapEnv;
//        this.env = env;
//    }

    @PostConstruct
    private void init() {
        log.info("testing app.aws.token with Value+SpEL " + this.awsToken);
        log.info("testing app.aws.token with env " + this.env.getProperty("app.aws.token"));
        log.info("testing app.aws.token with envMap " + this.mapEnv.getToken());
    }


}
