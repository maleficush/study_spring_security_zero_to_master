package study.cnp._1_security_simple.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringsecuritybasicApplication {
    @GetMapping(value = "/welcome")
    public String sayWelcome(){
        return "welcome";
    }
}
