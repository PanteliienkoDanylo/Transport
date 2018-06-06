package stu.cn.ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.domain.Route;
import stu.cn.ua.repository.RouteRepository;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public Route add(Route route) {
        return routeRepository.saveAndFlush(route);
    }

    public void delete(Long id) {
        routeRepository.delete(id);
    }

    public void deleteAll() {
        routeRepository.deleteAll();
    }

    public Route getById(Long id) {
        return routeRepository.getOne(id);
    }

    public List<Route> getAll() {
        return routeRepository.findAll();
    }
}
