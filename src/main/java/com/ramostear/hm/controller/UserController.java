package com.ramostear.hm.controller;

import com.alibaba.fastjson.JSON;
import com.ramostear.hm.model.User;
import com.ramostear.hm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("s1")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("s2")
    public User save2(@RequestBody User user){
        return userService.save2(user);
    }

    @GetMapping("my/{id}")
    public User findOne(@PathVariable Long id){
        User user = userService.findById(id);
        System.out.println("user: "+ JSON.toJSONString(user));
        return user;
    }

    @GetMapping("hi/{id}")
    public User findOne2(@PathVariable Long id){
        User user = userService.findById2(id);
        System.out.println("user: "+ JSON.toJSONString(user));
        return user;
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
