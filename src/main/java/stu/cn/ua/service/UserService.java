package stu.cn.ua.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.domain.User;
import stu.cn.ua.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User add(User user) {
        return userRepository.saveAndFlush(user);
    }

    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }


}
