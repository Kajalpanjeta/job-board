package com.example.JobBoard.JobBoardSpringBoot.Dtos;

import com.example.JobBoard.JobBoardSpringBoot.Entities.Enums.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobApplicationResponseDto {
    private Long applicationId;
    private String jobTitle;
    private String companyName;
    private String applicantName;
    private ApplicationStatus applicationStatus;
    private String coverLetter;
    private LocalDate applicationDate;
}
