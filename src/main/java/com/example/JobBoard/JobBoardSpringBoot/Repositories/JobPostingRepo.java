package com.example.JobBoard.JobBoardSpringBoot.Repositories;


import com.example.JobBoard.JobBoardSpringBoot.Entities.JobPosting;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostingRepo extends JpaRepository<JobPosting,Long> {
}
