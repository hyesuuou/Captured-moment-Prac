package com.example.CapturedPrac.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nickname;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    // 생성자
    public User(String nickname, String name, String email, String password){
        this.nickname = nickname;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(UserRequestDto requestDto){
        this.nickname = requestDto.getNickname();
        this.name = requestDto.getName();
        this.email = requestDto.getEmail();
        this.password = requestDto.getPassword();
    }
}
