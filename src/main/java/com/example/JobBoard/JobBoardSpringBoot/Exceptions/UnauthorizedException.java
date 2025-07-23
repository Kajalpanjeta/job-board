package com.example.JobBoard.JobBoardSpringBoot.Exceptions;

public class UnauthorizedException extends RuntimeException{
    public UnauthorizedException(String message) {
        super(message);
    }
}

//Trying to enter a building without a pass(not logged in)-401
