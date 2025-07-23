package com.example.JobBoard.JobBoardSpringBoot.Controllers;


import com.example.JobBoard.JobBoardSpringBoot.Advices.ApiResponse;
import com.example.JobBoard.JobBoardSpringBoot.Dtos.UserDto;
import com.example.JobBoard.JobBoardSpringBoot.Entities.User;
import com.example.JobBoard.JobBoardSpringBoot.Services.Impl.UserServiceImpl;
import com.example.JobBoard.JobBoardSpringBoot.Services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/job-board")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

     @PostMapping("/create-user")
     public ResponseEntity<ApiResponse<UserDto>>createUser(@Valid @RequestBody UserDto userDto){
         UserDto createdUser =userService.createUser(userDto);
         return ResponseEntity.status(HttpStatus.CREATED)
                 .body(new ApiResponse<>(LocalDateTime.now(),createdUser,null));
     }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<ApiResponse<UserDto>> getUserById(@PathVariable Long id){
         UserDto userDto= userService.getUserById(id);
         return ResponseEntity.ok(new ApiResponse<>(LocalDateTime.now(),userDto,null));
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<ApiResponse<List<UserDto>>>getAllUsers(){
         List<UserDto>userDtos= userService.getAllUsers();
         return ResponseEntity.ok(new ApiResponse<>(LocalDateTime.now(),userDtos,null));
    }

    @PatchMapping("/UpdateUser/{id}")
    public ResponseEntity<ApiResponse<UserDto>> updateUser(@RequestBody Map<String,Object> updates, @PathVariable Long id){
         UserDto userDto= userService.updateUser(id,updates);
         return ResponseEntity.ok(new ApiResponse<>(LocalDateTime.now(),userDto,null));
    }


    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<ApiResponse<Boolean>> deleteUser(@PathVariable Long id){
       boolean deleted= userService.deleteUser(id);
       return ResponseEntity.ok(new ApiResponse<>(LocalDateTime.now(),deleted,null));
    }
}
