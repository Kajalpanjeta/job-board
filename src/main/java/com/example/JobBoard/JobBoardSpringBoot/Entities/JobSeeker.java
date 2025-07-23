package com.example.JobBoard.JobBoardSpringBoot.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "jobSeeker")
    private List<JobApplication> jobApplications;

    private String resumeLink;
    private String phoneNumber;
    private String location;
    private String education;

    private String skills;

    private Integer experienceYears;
    private String linkedinProfile;
    private String githubProfile;
    private String bio;

}
