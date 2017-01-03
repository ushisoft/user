package io.ushi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class UserServiceApplication {

    @Autowired
    Environment env;

    @Value("${config.name}")
    String name = "World";

    @Value("${config.password}")
    String password = "letmein";

    @RequestMapping("/")
    public String home() {
        return "Hello " + env.getProperty("config.name");
    }

    @RequestMapping("/value")
    public String value() {
        return "Hello " + name;
    }

    @RequestMapping("/pass")
    public String pass() {
        return "Password is " + password;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args); //NOSONAR
    }
}
