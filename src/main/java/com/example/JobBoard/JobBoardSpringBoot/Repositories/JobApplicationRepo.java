package com.example.JobBoard.JobBoardSpringBoot.Repositories;

import com.example.JobBoard.JobBoardSpringBoot.Entities.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepo extends JpaRepository<JobApplication,Long> {
}
