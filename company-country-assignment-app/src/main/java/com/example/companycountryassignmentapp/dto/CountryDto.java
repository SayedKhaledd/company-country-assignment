package com.example.companycountryassignmentapp.dto;

import com.example.backendcoreservice.dto.Dto;

import java.time.LocalDateTime;

public record CountryDto(
        Long id,
        String name,
        String isoCode,
        LocalDateTime createdDate,
        LocalDateTime modifiedDate,
        String createdBy,
        String modifiedBy
) implements Dto {
    @Override
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public String getModifiedBy() {
        return modifiedBy;
    }
}