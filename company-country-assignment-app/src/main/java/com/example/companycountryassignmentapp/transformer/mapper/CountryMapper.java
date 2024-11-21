package com.example.companycountryassignmentapp.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Country;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CountryMapper extends AbstractMapper<Country, CountryDto> {


}
