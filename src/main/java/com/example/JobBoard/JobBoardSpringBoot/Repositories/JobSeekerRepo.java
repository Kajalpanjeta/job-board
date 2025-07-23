package com.example.JobBoard.JobBoardSpringBoot.Repositories;

import com.example.JobBoard.JobBoardSpringBoot.Entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker,Long> {
}
