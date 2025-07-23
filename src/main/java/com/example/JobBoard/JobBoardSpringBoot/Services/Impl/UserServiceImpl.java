package com.example.JobBoard.JobBoardSpringBoot.Services.Impl;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.UserDto;
import com.example.JobBoard.JobBoardSpringBoot.Entities.User;
import com.example.JobBoard.JobBoardSpringBoot.Exceptions.ConflictException;
import com.example.JobBoard.JobBoardSpringBoot.Exceptions.ResourceNotFoundException;
import com.example.JobBoard.JobBoardSpringBoot.Repositories.UserRepository;
import com.example.JobBoard.JobBoardSpringBoot.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//exceptions,logging and optional

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        if(userRepository.findByEmail(userDto.getEmail()).isPresent()){
            throw new ConflictException("Email already exists");
        }
        User mappedUser=modelMapper.map(userDto,User.class);
        mappedUser.setId(null);
        User savedUser=userRepository.save(mappedUser);

        return modelMapper.map(savedUser,UserDto.class);
    }

    @Override
    public UserDto getUserById(Long id) {
        User user=userRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("User doesn't exist"));
        return modelMapper.map(user,UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users=userRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user,UserDto.class))
                .collect(Collectors.toList());

    }
//for simply changing string
//    @Override
//    public UserDto updateUser(Long id, Map<String, Object> updates) {
//        boolean exists=ifUserExists(id);
//        if(!exists)return null;
//        User userEntity=userRepository.findById(id).get();
//        updates.forEach((fieldName,value)->{
//            Field field=ReflectionUtils.findField(User.class,fieldName);
//            field.setAccessible(true);
//            ReflectionUtils.setField(field,userEntity,value);
//        });
//        return modelMapper.map(userRepository.save(userEntity),UserDto.class);
//    }

//    for enum and string kind of json format

    public UserDto updateUser(Long id, Map<String, Object> updates){
        boolean exists=ifUserExists(id);
        if(!exists){
            throw new ResourceNotFoundException("id doesn't exist");
        }
        User userEntity=userRepository.findById(id).get();
        updates.forEach((fieldName,value)->{
            Field field=ReflectionUtils.findField(User.class,fieldName);
            field.setAccessible(true);
            if(field.getType().isEnum() && value instanceof String){
                Object enumValue=Enum.valueOf((Class<Enum>)field.getType(),value.toString());
                ReflectionUtils.setField(field,userEntity,enumValue);
            }
            else {
                ReflectionUtils.setField(field, userEntity, value);
            }
        });
        return modelMapper.map(userRepository.save(userEntity),UserDto.class);

    }

    public boolean ifUserExists(Long id){
        if(userRepository.existsById(id)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean deleteUser(Long id) {
        boolean exists=ifUserExists(id);
        if(!exists){
            throw new ResourceNotFoundException("id already doesn't exist");
        }
        userRepository.deleteById(id);
        return true;
    }
}
