package com.ddl.controller;

import com.ddl.service.GirlFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    GirlFriendService girlFriendService;

    @RequestMapping("/hi")
    public String sayHi(){
      return girlFriendService.say();
    }
}
