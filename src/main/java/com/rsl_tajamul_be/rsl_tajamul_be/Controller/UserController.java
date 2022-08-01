package com.rsl_tajamul_be.rsl_tajamul_be.Controller;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.News;
import com.rsl_tajamul_be.rsl_tajamul_be.Entity.User;
import com.rsl_tajamul_be.rsl_tajamul_be.Services.NewsService;
import com.rsl_tajamul_be.rsl_tajamul_be.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/getUser")
    public ArrayList<User> getUser() {
        return userService.getUser();
    }
    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);
    }
    @DeleteMapping("/ deleteUser/{id}")
    public String deleteUserId(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
        return "userDeleted";
    }
    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable("id") Long userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }
}
