package com.example.JobBoard.JobBoardSpringBoot.Services;


import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobApplicationResponseDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobPostingResponseDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobSeekerDto;

import java.util.List;
import java.util.Map;

public interface JobSeekerService {
    JobSeekerDto createProfile(Long userId,JobSeekerDto jobSeekerDto);
    JobSeekerDto updateProfile(Long userId, Map<String,Object> jobSeekerDto);
    JobSeekerDto getProfile(Long userId);
    List<JobPostingResponseDto> searchJobs(String keyword, String location, String jobType);
    List<JobApplicationResponseDto> getMyApplications(Long userId);
}
