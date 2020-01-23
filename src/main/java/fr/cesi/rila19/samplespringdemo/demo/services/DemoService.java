package fr.cesi.rila19.samplespringdemo.demo;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Getter
public class DemoService {
    private Integer number;
}
