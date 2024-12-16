package com.myproject.question_service.controller;



import com.myproject.question_service.entity.Question;
import com.myproject.question_service.entity.QuestionWrapper;
import com.myproject.question_service.entity.Response;
import com.myproject.question_service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;


    //http://localhost:8080/questions/allquestions
    @GetMapping("/allquestions")
    public ResponseEntity<List<Question>> getAllQuestions(){

        return questionService.getAllQuestions();

    }
    //http://localhost:8080/questions/category/Java
@GetMapping("category/{category}")
public  ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
}
//http://localhost:8080/questions/add
@PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
       return questionService.addQuestion(question);

}
//http://localhost:8080/questions/generate?categoryName=Java&numQuestions=5
@GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName,@RequestParam Integer numQuestions){

        return questionService.getQuestionsForQuiz(categoryName,numQuestions);


    }

    //http://localhost:8080/question/getQuestions   --->[2,5,7,8,9]
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionIds){
        return questionService.getQuestionsFromId(questionIds);
    }



// http://localhost:8080/question/getScore----------->[{"id":4,"responses":3},{"id":6,"responses":"final int x=5"}]
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
}



}




