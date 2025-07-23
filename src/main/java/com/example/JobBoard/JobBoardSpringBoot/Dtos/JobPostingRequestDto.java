package com.example.JobBoard.JobBoardSpringBoot.Dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingRequestDto {

    private String title;
    private String description;
    private String location;
    private SalaryRange salary;
    private LocalDate applicationDeadline;
}

