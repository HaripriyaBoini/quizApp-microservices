package com.example.quiz_service.DAOLayer;


import com.example.quiz_service.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
