package com.example.quiz.Quiz.dao;

import com.example.quiz.Quiz.entity.QuestionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "questionCategory", path = "question-category")
public interface QuestionCategoryRepository extends JpaRepository<QuestionCategory, Long>
{
}
