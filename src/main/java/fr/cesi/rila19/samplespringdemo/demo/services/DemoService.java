package fr.cesi.rila19.samplespringdemo.demo.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Getter
// default scope singleton
// @Scope("singleton")
// @Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DemoService implements IService{
    private Integer number;

//    DemoService() {
//        this.number = 10;
//    }

    @PostConstruct()
    private void init() {
        this.number = (int) (Math.random() * 100);
    }
}
