package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email", unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private UserInventory userInventory;

    @OneToMany(mappedBy="blog")
    private List<Blog> posts;

}
