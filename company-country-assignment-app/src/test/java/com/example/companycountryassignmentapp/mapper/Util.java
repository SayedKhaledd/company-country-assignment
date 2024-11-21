package com.example.companycountryassignmentapp.mapper;

import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Country;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Util {
    public static CountryDto createDummyCountryDto() {
        return new CountryDto(new Random(1L).nextLong(),
                "Country" + UUID.randomUUID(),
                "123" + UUID.randomUUID(),
                LocalDateTime.now(),
                LocalDateTime.now(),
                "Admin",
                "Admin");
    }

    public static Country createDummyCountry() {
        Country c = new Country();
        c.setId(new Random(1L).nextLong());
        c.setName("Country" + UUID.randomUUID());
        c.setIsoCode("123" + UUID.randomUUID());
        c.setCreatedDate(LocalDateTime.now());
        c.setModifiedDate(LocalDateTime.now());
        c.setCreatedBy("Admin");
        c.setModifiedBy("Admin");
        return c;
    }

}
