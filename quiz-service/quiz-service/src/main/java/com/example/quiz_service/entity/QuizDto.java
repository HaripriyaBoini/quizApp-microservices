package com.example.quiz_service.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public String getTitle() {
        return title;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
