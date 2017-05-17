package stu.cn.ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.domain.User;
import stu.cn.ua.domain.enumeration.Role;
import stu.cn.ua.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/add")
    public User create(){
        User user = new User();
        user.setId(34343l);
        user.setLogin("admin");
        user.setPassword("admin");
        user.setEmail("eqweqwewqe");
        user.setBalance(55.0);
        user.setRole(Role.ADMIN);
        return user;
    }
}
