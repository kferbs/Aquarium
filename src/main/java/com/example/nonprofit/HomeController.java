package com.example.nonprofit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/memberpage")
    public String memberPage() {
        return "memberpage";
    }

    @RequestMapping("/visitpage")
    public String visitPage() {
        return "visitpage";
    }

    @RequestMapping("/contactpage")
    public String contactPage() {
        return "contactpage";
    }

    @RequestMapping("/animals")
    public String animalPage() {
        return "animals";
    }

    @RequestMapping("/octopus")
    public String octopus() {
        return "octopus";
    }

    @RequestMapping("/seaotters")
    public String seaotters() {
        return "seaotters";
    }

    @RequestMapping("/penguins")
    public String penguins() {
        return "penguins";
    }

    @RequestMapping("/sharkcam")
    public String sharkcam() {
        return "sharkcam";
    }

    @RequestMapping("/aboutus")
    public String aboutUs() {
        return "aboutus";
    }


}

