package mypr.project.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mypr.project.springboot.model.UserLoginRequest;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public String login(@RequestBody UserLoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Check if the username and password are correct
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";
        }
    }
}
