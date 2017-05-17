package stu.cn.ua.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.domain.Station;
import stu.cn.ua.repository.StationRepository;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    public Station create(Station station){
        return stationRepository.saveAndFlush(station);
    }

    public void delete(Long id){
        stationRepository.delete(id);
    }

    public List<Station> getAll(){
        return stationRepository.findAll();
    }

}
