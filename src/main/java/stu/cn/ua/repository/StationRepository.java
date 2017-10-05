package stu.cn.ua.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.cn.ua.domain.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long>{
	
	//@Query("SELECT s FROM station s where s.id in (select rs.station_id from route_station rs where rs.route_id = :routeId);")
	List<Station> findAllByRoutes_Id(Long id);
}
