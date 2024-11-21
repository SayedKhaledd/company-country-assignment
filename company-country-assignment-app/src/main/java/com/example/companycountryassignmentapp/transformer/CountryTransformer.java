package com.example.companycountryassignmentapp.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.companycountryassignmentapp.transformer.mapper.CountryMapper;
import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Country;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class CountryTransformer implements AbstractTransformer<Country, CountryDto, CountryMapper> {

    private final CountryMapper countryMapper;

    @Override
    public CountryMapper getMapper() {
        return countryMapper;
    }


}
