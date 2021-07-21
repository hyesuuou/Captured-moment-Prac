package com.example.CapturedPrac.controller;

import com.example.CapturedPrac.domain.JoinResponse;
import com.example.CapturedPrac.domain.User;
import com.example.CapturedPrac.domain.UserRepository;
import com.example.CapturedPrac.domain.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Join;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    // 회원가입
    @PostMapping("/signup")
    public JoinResponse signupUser(@RequestBody UserRequestDto userRequestDto){
        User newUser = new User(userRequestDto);
        userRepository.save(newUser);
        JoinResponse response = new JoinResponse(200, "회원가입 성공");
        return response;
    }
}
