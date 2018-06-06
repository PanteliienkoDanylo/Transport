package stu.cn.ua.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.domain.Transaction;
import stu.cn.ua.repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction create(Transaction transaction) {
        return transactionRepository.saveAndFlush(transaction);
    }

    public void delete(Long id) {
        transactionRepository.delete(id);
    }

    public void deleteAll() {
        transactionRepository.deleteAll();
    }

    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }
}
