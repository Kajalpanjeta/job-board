package com.example.JobBoard.JobBoardSpringBoot.Dtos;

import com.example.JobBoard.JobBoardSpringBoot.Entities.Enums.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobPostingResponseDto {

    private Long id;
    private String title;
    private String description;
    private String location;
    private String salaryRange;
    private LocalDate postedDate;
    private LocalDate applicationDeadline;
    private String companyName;
    private JobStatus jobStatus;

}
