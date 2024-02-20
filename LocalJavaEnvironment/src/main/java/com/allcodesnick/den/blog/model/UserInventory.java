package com.allcodesnick.den.blog.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_inventory")
public class UserInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
