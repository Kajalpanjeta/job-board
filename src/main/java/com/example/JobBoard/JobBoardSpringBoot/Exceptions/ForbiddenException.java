package com.example.JobBoard.JobBoardSpringBoot.Exceptions;

public class ForbiddenException extends RuntimeException{
    public ForbiddenException(String message) {
        super(message);
    }
}
//You entered, but not allowed in CEO’s cabin-403
