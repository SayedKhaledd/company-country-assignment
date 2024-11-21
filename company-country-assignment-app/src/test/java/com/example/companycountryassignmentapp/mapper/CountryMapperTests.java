package com.example.companycountryassignmentapp.mapper;


import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Country;
import com.example.companycountryassignmentapp.transformer.mapper.CountryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.companycountryassignmentapp.mapper.Util.createDummyCountry;
import static com.example.companycountryassignmentapp.mapper.Util.createDummyCountryDto;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CountryMapperTests {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    void transformEntityToDto() {
        CountryDto dto = createDummyCountryDto();
        Country entity = countryMapper.transformDtoToEntity(dto);
        assertEquals(dto.id(), entity.getId());
        assertEquals(dto.name(), entity.getName());
    }

    @Test
    void transformDtoToEntity() {
        Country entity = createDummyCountry();
        CountryDto dto = countryMapper.transformEntityToDto(entity);
        assertEquals(entity.getId(), dto.id());
        assertEquals(entity.getName(), dto.name());
    }


}
