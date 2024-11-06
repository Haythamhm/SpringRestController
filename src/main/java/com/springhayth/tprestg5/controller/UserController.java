package com.springhayth.tprestg5.controller;

import com.springhayth.tprestg5.model.User;
import com.springhayth.tprestg5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUserList();
    }

    @GetMapping("/user")
    public User getUserById(@RequestParam("p") int code){
        return userService.getUser(code);
    }

    @PutMapping("/user")
    public User updateUser(@RequestParam("u") int id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/supp")
    public String deleteUserById(@RequestParam("s") int code){
        return userService.deleteUser(code);
    }

}
