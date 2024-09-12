package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/greetings")
    public String message() {
        return "Welcome to SandalTreeSoft";
    }

    @GetMapping("/about")
    public String about() {
        return "This is the About page of SandalTreeSoft";
    }

    @GetMapping("/services")
    public String services() {
        return "SandalTreeSoft provides Software Development, DevOps, and Cloud Solutions";
    }

    @GetMapping("/contact")
    public String contact() {
        return "You can contact us at support@sandaltreesoft.com";
    }

    @GetMapping("/team")
    public String team() {
        return "Meet the Team: John Doe (CEO), Jane Smith (CTO), and Alice Johnson (Lead Developer)";
    }

    @GetMapping("/careers")
    public String careers() {
        return "We are hiring! Check out our open positions at SandalTreeSoft Careers page";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
