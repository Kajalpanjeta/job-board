package com.example.JobBoard.JobBoardSpringBoot.Services.Impl;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobApplicationRequestDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobApplicationResponseDto;
import com.example.JobBoard.JobBoardSpringBoot.Services.JobApplicationService;

import java.util.List;

public class JobApplicationImpl implements JobApplicationService {
    @Override
    public JobApplicationResponseDto applyToJob(Long jobSeekerId, Long jobPostingId, JobApplicationRequestDto requestDto) {
        return null;
    }

    @Override
    public List<JobApplicationResponseDto> getApplicationsByJobSeeker(Long jobSeekerId) {
        return List.of();
    }

    @Override
    public List<JobApplicationResponseDto> getApplicationsForJobPosting(Long jobPostingId) {
        return List.of();
    }

    @Override
    public JobApplicationResponseDto updateApplicationStatus(Long applicationId, String status) {
        return null;
    }

    @Override
    public boolean withdrawApplication(Long applicationId) {
        return false;
    }
}
