package com.example.mybatisshop.controller.support;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ApiResponse handler(RuntimeException exception) {
        return ApiResponse.error(exception.getMessage());
    }
}
