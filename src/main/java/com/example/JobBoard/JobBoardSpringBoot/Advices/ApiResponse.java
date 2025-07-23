package com.example.JobBoard.JobBoardSpringBoot.Advices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private LocalDateTime timeStamp;
    private T data;
    private ApiError apiError;

    public ApiResponse(ApiError apiError) {
        this.timeStamp = LocalDateTime.now();
        this.apiError = apiError;
        this.data = null;
    }

    public ApiResponse(T data) {
        this.timeStamp = LocalDateTime.now();
        this.data = data;
        this.apiError = null;
    }
}
