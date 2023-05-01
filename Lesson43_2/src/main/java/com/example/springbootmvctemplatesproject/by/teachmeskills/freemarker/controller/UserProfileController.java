package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.controller;

import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/profile")
public class UserProfileController {
    private final UserService userService;

    public UserProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView openLoginPage() {
        System.out.println("!!!!");
        return userService.getUserInfo();
    }

}
