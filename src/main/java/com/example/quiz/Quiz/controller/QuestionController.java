package com.example.quiz.Quiz.controller;

import com.example.quiz.Quiz.Service.QuestionService;
import com.example.quiz.Quiz.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {


    QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/question/{category}/{difficulty}/{questionNumber}")
    public List<Question> getUserAmountOfQuestions(@PathVariable int questionNumber, @PathVariable String  difficulty ,@PathVariable String category){
        System.out.println("============Working here =+++++++++++");
        return questionService.retrieveQuestionForQuiz(category,difficulty,questionNumber);
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestion();
    }

    @PostMapping("/questions")
    public void addQuestion(@RequestBody Question question){
        questionService.addAQuestion(question);
    }


}
