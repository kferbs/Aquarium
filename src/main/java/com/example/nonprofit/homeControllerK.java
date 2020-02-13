package com.example.nonprofit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeControllerK {
    @RequestMapping("/animals")
    public String animals(){
        return "animals";
    }
    @RequestMapping("/octopus")
    public String octopus(){
        return "octopus";
    }
    @RequestMapping("/sharkcam")
    public String sharkcam(){
        return "sharkcam";
    }
    @RequestMapping("/seaotters")
    public String seaotters() {
        return "seaotters";
    }
    @RequestMapping("/penguins")
    public String penguins() {
        return "penguins";
    }
}
