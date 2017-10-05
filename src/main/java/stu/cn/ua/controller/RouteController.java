package stu.cn.ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.cn.ua.domain.Route;
import stu.cn.ua.service.RouteService;

@RestController
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	
	@RequestMapping(path = "route/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Route> getAllRoutes() {
		return routeService.getAll();
	}

}
