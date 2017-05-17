package stu.cn.ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.domain.Comment;
import stu.cn.ua.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment create(Comment comment){
        return commentRepository.saveAndFlush(comment);
    }

    public void delete(Long id){
        commentRepository.delete(id);
    }

    public List<Comment> getAll(){
        return commentRepository.findAll();
    }


}
