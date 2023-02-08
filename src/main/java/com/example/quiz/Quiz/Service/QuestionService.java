package com.example.quiz.Quiz.Service;

import com.example.quiz.Quiz.entity.Question;
import com.example.quiz.Quiz.entity.QuestionCategory;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> retrieveQuestionForQuiz(String cateogory, String difficulty ,int amountOfQuestions);
    List<Question> getAllQuestion();



    void addAQuestion(Question questionCategory);


}
