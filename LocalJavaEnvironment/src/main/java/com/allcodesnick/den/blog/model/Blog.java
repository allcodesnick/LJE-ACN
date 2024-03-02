package com.allcodesnick.den.blog.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User author;
    private String title;
    private CommentInventory comment;
    private int upVote;
    private int downVote;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "blog_categories",
            joinColumns = { @JoinColumn(name = "blog_id") },
            inverseJoinColumns = { @JoinColumn(name = "categories_id") }
    )
    private Set<Categories> categories = new HashSet<>();
    private String content;
    private Time timestamp;

    @ManyToOne
    @JoinColumn(name="blog_id", nullable=false)
    private BlogInventory blogInventory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "blog_id", referencedColumnName = "id")
    private CommentInventory commentInventory;


}
