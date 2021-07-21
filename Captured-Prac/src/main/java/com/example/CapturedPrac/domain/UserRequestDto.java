package com.example.CapturedPrac.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserRequestDto {

    private final String nickname;
    private final String name;
    private final String email;
    private final String password;
}
