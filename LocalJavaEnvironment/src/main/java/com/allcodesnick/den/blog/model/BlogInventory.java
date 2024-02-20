package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "blog_inventory")
public class BlogInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
