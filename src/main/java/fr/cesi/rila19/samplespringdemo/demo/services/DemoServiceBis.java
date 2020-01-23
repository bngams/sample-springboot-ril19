package fr.cesi.rila19.samplespringdemo.demo.services;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class DemoServiceBis implements IService {
    private Integer number;

    DemoServiceBis() {
        this.number = (int) (Math.random() * 100);
    }

}
