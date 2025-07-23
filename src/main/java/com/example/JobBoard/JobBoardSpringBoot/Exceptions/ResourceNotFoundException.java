package com.example.JobBoard.JobBoardSpringBoot.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
//comes when UserNotFound with 404 error
