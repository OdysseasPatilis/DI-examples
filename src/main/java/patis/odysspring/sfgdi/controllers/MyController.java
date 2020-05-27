package patis.odysspring.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import patis.odysspring.sfgdi.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String dayHello(){
        return greetingService.sayGreeting();
    }
}
