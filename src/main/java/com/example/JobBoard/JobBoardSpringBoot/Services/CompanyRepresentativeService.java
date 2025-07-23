package com.example.JobBoard.JobBoardSpringBoot.Services;


import com.example.JobBoard.JobBoardSpringBoot.Dtos.CompanyRepresentativeDto;

import java.util.List;

public interface CompanyRepresentativeService {

    CompanyRepresentativeDto createCompanyProfile(Long userId, CompanyRepresentativeDto dto);

    CompanyRepresentativeDto getCompanyByUserId(Long userId);

    CompanyRepresentativeDto updateCompanyProfile(Long userId, CompanyRepresentativeDto dto);

    List<CompanyRepresentativeDto> getAllCompanies();
}
