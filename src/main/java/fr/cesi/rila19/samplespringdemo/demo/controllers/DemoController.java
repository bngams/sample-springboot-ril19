package fr.cesi.rila19.samplespringdemo.demo.controllers;

import fr.cesi.rila19.samplespringdemo.demo.services.DemoService;
import fr.cesi.rila19.samplespringdemo.demo.services.DemoServiceBis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    private final DemoService ds;

    @Autowired
    private DemoServiceBis dsb;

    @Autowired
    DemoController(DemoService ds) {
        this.ds = ds;
    }

    @RequestMapping("/hello")
    @ResponseBody()
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/hello-service")
    @ResponseBody()
    public String helloService() {
        return "My service has a number: " + ds.getNumber();
    }

}
