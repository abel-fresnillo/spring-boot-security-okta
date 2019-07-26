package dev.abel.springbootsecurityokta;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getPrincipal(@AuthenticationPrincipal OAuth2User userPrincipal) {
        return "Logged In: " + userPrincipal.getAttributes().get("name");
    }
}