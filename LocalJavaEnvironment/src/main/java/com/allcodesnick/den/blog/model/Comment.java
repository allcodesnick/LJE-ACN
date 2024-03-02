package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User author;
    private String title;
    @ManyToOne
    @JoinColumn(name="comments", nullable=false)
    private CommentInventory commentInventory;
    private int upVote;
    private int downVote;
    private Time timestamp;
}
