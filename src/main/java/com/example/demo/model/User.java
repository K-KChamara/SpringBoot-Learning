package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String name;
}
