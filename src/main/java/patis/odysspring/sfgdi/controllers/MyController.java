package patis.odysspring.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String dayHello(){
        System.out.println("Hello World");
        return "Hi folks!!!";
    }
}
