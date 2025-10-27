package org.study.springmybatis.common.exception.config;

public class DuplicateException extends RuntimeException{
    public DuplicateException(String message){
        super(message);
    }
}
