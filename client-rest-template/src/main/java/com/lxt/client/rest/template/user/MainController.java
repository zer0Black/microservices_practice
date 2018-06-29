package com.lxt.client.rest.template.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

//    public String callback(String code, String state){
//        UserDetails userDetails = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        OAuth2Token
//    }

}
