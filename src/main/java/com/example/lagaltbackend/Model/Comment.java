package com.example.lagaltbackend.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Comment")
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Project project;

    @Column(name = "message")
    private String message;

}
