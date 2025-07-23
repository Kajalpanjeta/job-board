package com.example.JobBoard.JobBoardSpringBoot.Dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyRepresentativeDto {

    private UserDto userDto;
    private String companyName;
    private String companyDescription;
    private String companyWebsite;
    private String companyLocation;


}
