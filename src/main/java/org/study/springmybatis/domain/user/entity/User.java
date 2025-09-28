package org.study.springmybatis.domain.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {

    Long id;

    String username;
    String password;

    @Builder
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static User create(String username, String password) {
        return User.builder().username(username).password(password).build();
    }
}
