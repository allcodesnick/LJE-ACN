package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comment_inventory")
public class CommentInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
