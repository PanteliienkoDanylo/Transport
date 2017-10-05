package stu.cn.ua.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stu.cn.ua.domain.Transport;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long>{
	
	List<Transport> findAllByRoute_Id(Long id);
}
