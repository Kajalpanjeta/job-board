package com.example.JobBoard.JobBoardSpringBoot.Services;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobPostingRequestDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobPostingResponseDto;

import java.util.List;

public interface JobPostingService {

    JobPostingResponseDto createJobPosting(Long companyId, JobPostingRequestDto requestDto);
    JobPostingResponseDto updateJobPosting(Long jobId, JobPostingRequestDto requestDto);
    JobPostingResponseDto getJobPostingById(Long jobId);
    List<JobPostingResponseDto> getAllJobPostings();
    List<JobPostingResponseDto> getJobPostingsByCompany(Long companyId);
    boolean deleteJobPosting(Long jobId);
}
