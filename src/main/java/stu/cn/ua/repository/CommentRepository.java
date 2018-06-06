package stu.cn.ua.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.cn.ua.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
