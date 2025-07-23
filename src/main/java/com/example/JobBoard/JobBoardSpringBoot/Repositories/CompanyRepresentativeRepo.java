package com.example.JobBoard.JobBoardSpringBoot.Repositories;

import com.example.JobBoard.JobBoardSpringBoot.Entities.CompanyRepresentative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepresentativeRepo extends JpaRepository<CompanyRepresentative,Long> {
}
