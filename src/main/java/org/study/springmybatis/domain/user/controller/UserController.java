package org.study.springmybatis.domain.user.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.study.springmybatis.domain.user.dto.UserDetailResponse;
import org.study.springmybatis.domain.user.dto.UserCreateRequest;
import org.study.springmybatis.domain.user.service.UserService;

@Tag(name = "User API", description = "유저 도메인 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<?> saveUser(@RequestBody @Valid UserCreateRequest request) {

        userService.saveUser(request);

        return ResponseEntity.status(HttpStatus.OK).body("user save!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetailResponse> findById(@PathVariable Long id) {

        UserDetailResponse response = userService.findById(id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
