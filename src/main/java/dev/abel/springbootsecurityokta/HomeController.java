package dev.abel.springbootsecurityokta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getPrincipal(Principal principal) {
        return "Principal: " + principal.getName();
    }
}