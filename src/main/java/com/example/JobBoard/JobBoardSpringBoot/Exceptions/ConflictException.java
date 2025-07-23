package com.example.JobBoard.JobBoardSpringBoot.Exceptions;

public class ConflictException extends RuntimeException{
    public ConflictException(String message) {
        super(message);
    }
}
//comes when there is duplicacy in fields-409
