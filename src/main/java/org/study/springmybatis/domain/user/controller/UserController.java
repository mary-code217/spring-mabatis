package org.study.springmybatis.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.springmybatis.domain.user.dto.UserSaveRequest;
import org.study.springmybatis.domain.user.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<?> saveUser(@RequestBody UserSaveRequest request) {

        userService.saveUser(request);

        return ResponseEntity.status(HttpStatus.OK).body("user save!");
    }
}
