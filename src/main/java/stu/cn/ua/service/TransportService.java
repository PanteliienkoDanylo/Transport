package stu.cn.ua.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.domain.Transport;
import stu.cn.ua.repository.TransportRepository;

import java.util.List;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transportRepository;

    public Transport create(Transport transport) {
        return transportRepository.saveAndFlush(transport);
    }

    public void delete(Long id) {
        transportRepository.delete(id);
    }

    public void deleteAll() {
        transportRepository.deleteAll();
    }

    public List<Transport> getAll() {
        return transportRepository.findAll();
    }
}
