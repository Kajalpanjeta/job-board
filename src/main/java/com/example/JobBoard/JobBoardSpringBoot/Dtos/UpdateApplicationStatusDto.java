package com.example.JobBoard.JobBoardSpringBoot.Dtos;


import com.example.JobBoard.JobBoardSpringBoot.Entities.Enums.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateApplicationStatusDto {
    private ApplicationStatus applicationStatus;
}
