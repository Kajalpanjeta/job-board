package com.example.JobBoard.JobBoardSpringBoot.Services;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.UserDto;
import com.example.JobBoard.JobBoardSpringBoot.Entities.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long id, Map<String,Object> updates);
    boolean deleteUser(Long id);

}
