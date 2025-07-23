package com.example.JobBoard.JobBoardSpringBoot.Entities;

import com.example.JobBoard.JobBoardSpringBoot.Entities.Enums.ApplicationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate applicationDate;


    @ManyToOne
    @JoinColumn(name = "Job_Seeker_id")
    private JobSeeker jobSeeker;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private String coverLetter;

    @ManyToOne
    @JoinColumn(name = "job_posting_id")
    private JobPosting jobPosting;




}
