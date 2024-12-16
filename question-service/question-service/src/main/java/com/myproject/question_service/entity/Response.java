package com.myproject.question_service.entity;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class Response {

    private Integer id;
    private String responses;

    public Response(Integer id, String responses) {
        this.id = id;
        this.responses = responses;
    }

    public Integer getId() {
        return id;
    }

    public String getResponses() {
        return responses;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }
}
