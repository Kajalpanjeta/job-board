package com.example.JobBoard.JobBoardSpringBoot.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerDto{

    private UserDto userDto;

    private String resumeLink;
    private String phoneNumber;
    private String location;
    private String education;
    private List<String> skills;
    private Integer experienceYears;
    private String linkedinProfile;
    private String githubProfile;
    private String bio;

}
