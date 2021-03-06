package stu.cn.ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.cn.ua.domain.User;
import stu.cn.ua.domain.enumeration.Role;
import stu.cn.ua.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
        

    
    @RequestMapping(path = "user/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getAllUser(){
    	return userService.getAll();
    }

}
