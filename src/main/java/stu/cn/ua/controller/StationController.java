package stu.cn.ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stu.cn.ua.domain.Station;
import stu.cn.ua.service.StationService;

@RestController
public class StationController {
		
	@Autowired
	private StationService stationService;
	
	
	@RequestMapping(path = "/station/byRouteId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Station> findStationsByRouteId(@RequestParam Long routeId){
		return stationService.findStationsByRouteId(routeId);
	}
	
	@RequestMapping(path = "/station/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Station> getAllStation(){
		return stationService.getAll();
	}
	

}
