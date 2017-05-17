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

    public User create(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void remove(Long id){
        userRepository.delete(id);
    }

    public void removeAll(){
        userRepository.deleteAll();
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }


}
