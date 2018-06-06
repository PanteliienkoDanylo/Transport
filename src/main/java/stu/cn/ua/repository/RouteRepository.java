package stu.cn.ua.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.cn.ua.domain.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

}
