package com.example.quiz.Quiz.dao;

import com.example.quiz.Quiz.entity.Question;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface QuestionRepository extends JpaRepository<Question, Long> {

}

