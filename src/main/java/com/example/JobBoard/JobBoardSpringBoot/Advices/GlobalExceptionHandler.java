package com.example.JobBoard.JobBoardSpringBoot.Advices;


import com.example.JobBoard.JobBoardSpringBoot.Exceptions.ConflictException;
import com.example.JobBoard.JobBoardSpringBoot.Exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.CompletionException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<?>>handleResourceNotFoundException(ResourceNotFoundException e){
        ApiError apiError= ApiError.builder().status(HttpStatus.NOT_FOUND).message(e.getMessage()).build();
        return buildResponseEntity(apiError);

    }
    private ResponseEntity<ApiResponse<?>> buildResponseEntity(ApiError apiError){
        return  new ResponseEntity<>(new ApiResponse<>(apiError),apiError.getStatus());
    }

    @ExceptionHandler(ConflictException.class)
     public ResponseEntity<ApiResponse<?>> handleConflictException(ConflictException e){
        ApiError apiError=ApiError.builder()
                .status(HttpStatus.CONFLICT).message(e.getMessage()).build();
        return buildResponseEntity(apiError);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> handleGenericException(Exception e){
        ApiError apiError= ApiError.builder().status(HttpStatus.INTERNAL_SERVER_ERROR).message(("Something went wrong: "+e.getMessage())).build();
        return buildResponseEntity(apiError);
    }

}
