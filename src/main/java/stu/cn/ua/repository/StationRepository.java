package stu.cn.ua.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.cn.ua.domain.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long>{
}
