package com.example.quiz_service.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Getter
@Setter
public class Quiz {
          @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
          private String title;



@ElementCollection
    private List<Integer> questionsIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getQuestionsIds() {
        return questionsIds;
    }

    public void setQuestionsIds(List<Integer> questionsIds) {
        this.questionsIds = questionsIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
