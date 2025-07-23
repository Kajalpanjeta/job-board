package com.example.JobBoard.JobBoardSpringBoot.Dtos;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class SalaryRange {
    private double minSalary;
    private double maxSalary;
}
