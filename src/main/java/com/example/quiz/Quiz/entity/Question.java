package com.example.quiz.Quiz.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Entity
@Table(name="question")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private QuestionCategory category;

    @Column(name = "description")
    private String description;

    @Column(name = "correct_answer")
    private String correct_answer;

    @Column(name = "incorrect_answer_one")
    private String incorrectAnswerOne;

    @Column(name = "incorrect_answer_two")
    private String incorrectAnswerTwo;

    @Column(name = "incorrect_answer_three")
    private String incorrectAnswerThree;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "active")
    private boolean active;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

}
