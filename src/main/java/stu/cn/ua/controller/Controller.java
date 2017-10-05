package stu.cn.ua.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello world";
	}

}
