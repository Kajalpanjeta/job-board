package com.example.JobBoard.JobBoardSpringBoot.Dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobApplicationRequestDto {
    private String coverLetter;
    private Double expectedSalary;
    private String noticePeriod;
}
