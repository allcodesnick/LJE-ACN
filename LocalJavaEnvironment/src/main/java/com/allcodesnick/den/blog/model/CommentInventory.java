package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "comment_inventory")
public class CommentInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy="comment_inventory")
    private List<Comment> comments;

    @OneToOne(mappedBy = "comment_inventory")
    private Blog blog;

}
