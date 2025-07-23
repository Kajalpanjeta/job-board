package com.example.JobBoard.JobBoardSpringBoot.Entities;


import com.example.JobBoard.JobBoardSpringBoot.Dtos.SalaryRange;
import com.example.JobBoard.JobBoardSpringBoot.Entities.Enums.JobStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyRepresentative company;


    @OneToMany(mappedBy = "jobPosting")
    private List<JobApplication> applications;

    private SalaryRange salaryRange;

    private LocalDate postedDate;
    private LocalDate applicationDeadline;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

}
