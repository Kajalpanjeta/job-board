package com.example.JobBoard.JobBoardSpringBoot.Services.Impl;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobPostingRequestDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobPostingResponseDto;
import com.example.JobBoard.JobBoardSpringBoot.Services.JobPostingService;

import java.util.List;

public class JobPostingImpl implements JobPostingService {
    @Override
    public JobPostingResponseDto createJobPosting(Long companyId, JobPostingRequestDto requestDto) {
        return null;
    }

    @Override
    public JobPostingResponseDto updateJobPosting(Long jobId, JobPostingRequestDto requestDto) {
        return null;
    }

    @Override
    public JobPostingResponseDto getJobPostingById(Long jobId) {
        return null;
    }

    @Override
    public List<JobPostingResponseDto> getAllJobPostings() {
        return List.of();
    }

    @Override
    public List<JobPostingResponseDto> getJobPostingsByCompany(Long companyId) {
        return List.of();
    }

    @Override
    public boolean deleteJobPosting(Long jobId) {
        return false;
    }
}
