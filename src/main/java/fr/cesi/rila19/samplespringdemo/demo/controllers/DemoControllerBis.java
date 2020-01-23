package fr.cesi.rila19.samplespringdemo.demo.controllers;

import fr.cesi.rila19.samplespringdemo.demo.services.DemoService;
import fr.cesi.rila19.samplespringdemo.demo.services.DemoServiceBis;
import fr.cesi.rila19.samplespringdemo.demo.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoControllerBis {

    @Autowired
    @Qualifier("demoServiceBis")
    private IService dsb;

    private final DemoService ds;

    @Autowired
    DemoControllerBis(DemoService ds) {
        this.ds = ds;
    }

    @RequestMapping("/hello-service-bis")
    @ResponseBody()
    public String helloService() {
        return "My service has a number: " + ds.getNumber();
    }
}
