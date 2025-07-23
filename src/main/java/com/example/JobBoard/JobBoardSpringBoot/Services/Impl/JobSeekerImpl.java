package com.example.JobBoard.JobBoardSpringBoot.Services.Impl;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobApplicationResponseDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobPostingResponseDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobSeekerDto;
import com.example.JobBoard.JobBoardSpringBoot.Services.JobSeekerService;

import java.util.List;
import java.util.Map;

public class JobSeekerImpl implements JobSeekerService {
    @Override
    public JobSeekerDto createProfile(Long userId, JobSeekerDto jobSeekerDto) {
        return null;

    }

    @Override
    public JobSeekerDto updateProfile(Long userId, Map<String, Object> jobSeekerDto) {
        return null;
    }

    @Override
    public JobSeekerDto getProfile(Long userId) {
        return null;
    }

    @Override
    public List<JobPostingResponseDto> searchJobs(String keyword, String location, String jobType) {
        return List.of();
    }

    @Override
    public List<JobApplicationResponseDto> getMyApplications(Long userId) {
        return List.of();
    }
}
