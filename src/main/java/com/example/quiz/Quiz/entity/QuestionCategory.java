package com.example.quiz.Quiz.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
@Entity
@Table(name="quiz_category")
@Data
public class QuestionCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Question> question;
}
