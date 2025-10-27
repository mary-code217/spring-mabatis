package org.study.springmybatis.common.exception.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.study.springmybatis.common.exception.NotFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionHandleConfig extends RuntimeException{

    @ExceptionHandler(Exception.class)
    public ProblemDetail handleException(Exception e){
        return getProblemDetail(HttpStatus.INTERNAL_SERVER_ERROR, e);
    }

    @ExceptionHandler(NotFoundException.class)
    public ProblemDetail handleUserNotFoundException(NotFoundException e){
        return getProblemDetail(HttpStatus.NOT_FOUND, e);
    }

    @ExceptionHandler(DuplicateException.class)
    public ProblemDetail handleDuplicateException(DuplicateException e){
        return getProblemDetail(HttpStatus.CONFLICT, e);
    }

    private static ProblemDetail getProblemDetail(HttpStatus status, Exception e) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(status, e.getMessage());

        problemDetail.setProperty("timestamp", LocalDateTime.now());
        problemDetail.setProperty("exception", e.getClass().getSimpleName());

        return problemDetail;
    }

}
