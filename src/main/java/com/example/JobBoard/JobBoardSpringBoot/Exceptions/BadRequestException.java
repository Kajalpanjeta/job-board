package com.example.JobBoard.JobBoardSpringBoot.Exceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}
//Required Field Missing 400
