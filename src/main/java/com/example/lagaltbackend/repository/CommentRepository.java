package com.example.lagaltbackend.repository;

import com.example.lagaltbackend.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
