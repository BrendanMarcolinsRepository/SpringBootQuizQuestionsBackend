package com.example.quiz.Quiz.Service;

import com.example.quiz.Quiz.dao.QuestionCategoryRepository;
import com.example.quiz.Quiz.dao.QuestionRepository;
import com.example.quiz.Quiz.entity.Question;
import com.example.quiz.Quiz.entity.QuestionCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImplementation implements QuestionService{


    QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImplementation(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }



    @Override
    public List<Question> retrieveQuestionForQuiz(String cateogory, String difficulty ,int amountOfQuestions) {
        List<Question> questions = null;
        List<Question> question2 = null;
        List<Question> question3 = null;


        ArrayList<Integer> randomNumbers = new ArrayList<>();

        if(amountOfQuestions > 0){

            questions = questionRepository.findAll();

            question2 = new ArrayList<>();



            for(Question question : questions){

                if(question.getCategory().getCategoryName().matches(cateogory)
                        && question.getDifficulty().matches(difficulty)){
                    question2.add(question);
                }

            }


            Random random = new Random();

            for(int i = 0; i < amountOfQuestions; i++){
                int randomNumber = random.nextInt(4);

                if(i != 0){

                    if(randomNumbers.stream().noneMatch(p -> p == randomNumber)){
                        randomNumbers.add(randomNumber);
                    }else{
                        i--;
                    }

                }else{
                    randomNumbers.add(randomNumber);
                }
            }
            question3 = new ArrayList<>();

            for(int i = 0; i < randomNumbers.size(); i++){

                System.out.println(randomNumbers.get(i));
                question3.add(question2.get(randomNumbers.get(i)));

            }

            for(Question q : question3){
                System.out.println(q);
            }


        }

        return question3;

    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public void addAQuestion(Question questionCategory) {

    }

}
