package com.example.JobBoard.JobBoardSpringBoot.Services;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobApplicationRequestDto;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.JobApplicationResponseDto;

import java.util.List;

public interface JobApplicationService {

    JobApplicationResponseDto applyToJob(Long jobSeekerId, Long jobPostingId, JobApplicationRequestDto requestDto);

    List<JobApplicationResponseDto> getApplicationsByJobSeeker(Long jobSeekerId);

    List<JobApplicationResponseDto> getApplicationsForJobPosting(Long jobPostingId);

    JobApplicationResponseDto updateApplicationStatus(Long applicationId, String status); // (optional - for company to accept/reject)

    boolean withdrawApplication(Long applicationId);
}
