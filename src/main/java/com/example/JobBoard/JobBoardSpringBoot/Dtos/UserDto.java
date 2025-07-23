package com.example.JobBoard.JobBoardSpringBoot.Dtos;


import com.example.JobBoard.JobBoardSpringBoot.Entities.Enums.Role;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @Null(message = "ID must not be provided when creating a user")
    private Long id;
    private String name;
    private String email;
    private Role role;
}
