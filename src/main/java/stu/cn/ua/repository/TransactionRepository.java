package stu.cn.ua.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.cn.ua.domain.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
