package com.example.JobBoard.JobBoardSpringBoot.Repositories;

import com.example.JobBoard.JobBoardSpringBoot.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
