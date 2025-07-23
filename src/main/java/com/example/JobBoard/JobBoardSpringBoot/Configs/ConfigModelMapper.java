package com.example.JobBoard.JobBoardSpringBoot.Configs;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigModelMapper {


    @Bean
    ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
