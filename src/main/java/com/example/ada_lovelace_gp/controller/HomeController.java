package com.example.ada_lovelace_gp.controller;

import com.example.ada_lovelace_gp.data.User;
import com.example.ada_lovelace_gp.service.UserService;
import lombok.Data;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Object hello(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
        OAuth2User userOauth = oAuth2AuthenticationToken.getPrincipal();
        List<User> users = (List<User>) this.userService.findBySub(userOauth.getName());
//        User user;
        if (users.isEmpty()) {
            this.userService.addUser(new User(userOauth.getAttribute("name"), userOauth.getName()));
//            user = ((List<User>) this.userService.findBySub(userOauth.getName())).get(0);
        } else {
//            user = users.get(0);
        }
        return userOauth;
    }
}
