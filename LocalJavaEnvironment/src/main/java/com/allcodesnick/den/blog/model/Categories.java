package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private List<String> categories;

    @ManyToMany(mappedBy = "categories")
    private Set<Blog> blogs = new HashSet<>();
}
