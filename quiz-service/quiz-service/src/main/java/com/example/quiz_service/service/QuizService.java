package com.example.quiz_service.service;



import com.example.quiz_service.DAOLayer.QuizDao;
import com.example.quiz_service.entity.QuestionWrapper;
import com.example.quiz_service.entity.Quiz;
import com.example.quiz_service.entity.Response;
import com.example.quiz_service.feign.QuizInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {


    @Autowired
    QuizDao quizDao;
    @Autowired
    QuizInterface quizInterface;


    //Add quiz or create quiz
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

List<Integer> questions=quizInterface.getQuestionsForQuiz(category,numQ).getBody();
Quiz quiz=new Quiz();
quiz.setTitle(title);
quiz.setQuestionsIds(questions);
quizDao.save(quiz);






        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {

//
//        Optional<Quiz> quiz=quizDao.findById(id);
//        List<Question> questionsFromDB=quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
//
//        for(Question q:questionsFromDB){
//            QuestionWrapper qw=new QuestionWrapper(q.getId(),q.getOption1(), q.getOption2(),q.getOption3(),q.getOption4(),q.getQuestionTitle());
//            questionsForUser.add(qw);
//
//
//        }
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        //List<Question> questions=quiz.getQuestions();
//
//        int right=0;
//        int i=0;
//for(Response response:responses){
//    if(response.getResponses().equals(questions.get(i).getRightAnswer())){
//        right++;
//    }
//    i++;
//
//}
return new ResponseEntity<>( HttpStatus.OK);


    }

}
