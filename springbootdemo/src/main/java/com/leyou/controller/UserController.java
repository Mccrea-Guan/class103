package com.leyou.controller;

import com.leyou.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//相当于@controller和@ResponseBody
@RestController
//日志控制(基于lombok)
@Slf4j
@RequestMapping("/user")
public class UserController {


    @Autowired
    private User user;
    //相当于@ResultMapping(value = "/hello" ,method = RequestMethod.GET)
@GetMapping("/hello")
    public String hello(){
   log.debug("wdnmd"+user);
    return "hello my friend";
}
    @GetMapping("/hello1")
    public String hello1(){

        return "这是一个静态方法";
    }
}
