package com.example.mybatisshop.controller.support;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ApiResponse(
        int statusCode,
        Object data,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime serverResponseTime
) {

    public static ApiResponse ok(Object data) {
        return new ApiResponse(HttpStatus.OK.value(), data, LocalDateTime.now());
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(HttpStatus.BAD_REQUEST.value(), message, LocalDateTime.now());
    }
}
