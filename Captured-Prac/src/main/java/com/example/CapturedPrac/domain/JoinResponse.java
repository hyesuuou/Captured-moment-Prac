package com.example.CapturedPrac.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
public class JoinResponse {

    private int statusCode;
    private String message;

    public JoinResponse(int statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }

}
