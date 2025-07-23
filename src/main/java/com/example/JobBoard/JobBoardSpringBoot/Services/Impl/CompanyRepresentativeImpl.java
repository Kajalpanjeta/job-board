package com.example.JobBoard.JobBoardSpringBoot.Services.Impl;

import com.example.JobBoard.JobBoardSpringBoot.Dtos.CompanyRepresentativeDto;
import com.example.JobBoard.JobBoardSpringBoot.Services.CompanyRepresentativeService;

import java.util.List;

public class CompanyRepresentativeImpl implements CompanyRepresentativeService {
    @Override
    public CompanyRepresentativeDto createCompanyProfile(Long userId, CompanyRepresentativeDto dto) {
        return null;
    }

    @Override
    public CompanyRepresentativeDto getCompanyByUserId(Long userId) {
        return null;
    }

    @Override
    public CompanyRepresentativeDto updateCompanyProfile(Long userId, CompanyRepresentativeDto dto) {
        return null;
    }

    @Override
    public List<CompanyRepresentativeDto> getAllCompanies() {
        return List.of();
    }
}
