package com.example.companycountryassignmentapp.transformer.mapper;

import com.example.backendcoreservice.transformer.mapper.AbstractMapper;
import com.example.companycountryassignmentapp.dto.CompanyDto;
import com.example.companycountryassignmentapp.model.Company;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        uses = {CountryMapper.class})
public interface CompanyMapper extends AbstractMapper<Company, CompanyDto> {


}
