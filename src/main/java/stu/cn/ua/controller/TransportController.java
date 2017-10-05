package stu.cn.ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stu.cn.ua.domain.Transport;
import stu.cn.ua.service.TransportService;

@RestController
public class TransportController {

	@Autowired
	private TransportService transportService;

	@RequestMapping(path = "transport/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Transport> getAllTransport() {
		return transportService.getAll();
	}

	@RequestMapping(path = "/transport/byRouteId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Transport> getTransportsByRouteId(@RequestParam Long routeId) {
		return transportService.findTransportrsByRouteId(routeId);
	}

}
