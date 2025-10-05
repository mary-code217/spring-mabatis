package org.study.springmybatis.util.exception.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.study.springmybatis.util.exception.UserNotFoundException;

import java.time.Instant;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandleConfig extends RuntimeException{

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleUserNotFoundException(UserNotFoundException e, HttpServletRequest req){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of(
                "status", 400,
                "error", "BAD_REQUEST",
                "message", e.getMessage(),
                "path", req.getRequestURI(),
                "timestamp", Instant.now().toString()
        ));
    }

}
