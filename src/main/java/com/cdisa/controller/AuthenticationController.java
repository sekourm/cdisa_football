package com.cdisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {

    @RequestMapping("/inscription")
    public String index () {
        return "register";
    }

    @RequestMapping("/connexion")
    public String connect () {
        return "signin";
    }

    @PostMapping("/connexion")
    public String connectAction () {
        return "signin";
    }

}
