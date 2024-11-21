package com.example.companycountryassignmentapp.mapper;

import com.example.companycountryassignmentapp.dto.CompanyDto;
import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Company;
import com.example.companycountryassignmentapp.model.Country;
import com.example.companycountryassignmentapp.transformer.mapper.CompanyMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

import static com.example.companycountryassignmentapp.mapper.Util.createDummyCountry;
import static com.example.companycountryassignmentapp.mapper.Util.createDummyCountryDto;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class CompanyMapperTests {
    @Autowired
    private CompanyMapper companyMapper;

    @Test
    void transformDtoToEntity() {
        CompanyDto companyDto = createCompanyDto();
        Company company = companyMapper.transformDtoToEntity(companyDto);
        log.info("CompanyDto: {}", companyDto);
        log.info("Company: {}", company);
        assertEquals(companyDto.id(), company.getId());
        assertEquals(companyDto.name(), company.getName());
        assertEquals(companyDto.country().id(), company.getCountry().getId());
        assertEquals(companyDto.country().isoCode(), company.getCountry().getIsoCode());
        assertEquals(companyDto.country().name(), company.getCountry().getName());
    }

    @Test
    void transformEntityToDto() {
        Company company = createCompany();
        CompanyDto companyDto = companyMapper.transformEntityToDto(company);
        assertEquals(company.getId(), companyDto.id());
        assertEquals(company.getName(), companyDto.name());
        assertEquals(company.getCountry().getId(), companyDto.countryId());
        assertEquals(company.getCountry().getIsoCode(), companyDto.country().isoCode());
        assertEquals(company.getCountry().getName(), companyDto.country().name());
    }


    private CompanyDto createCompanyDto() {
        CountryDto countryDto = createDummyCountryDto();
        return new CompanyDto(
                new Random(1L).nextLong(),
                "Company" + UUID.randomUUID(),
                countryDto,
                countryDto.id(),
                LocalDateTime.now(),
                LocalDateTime.now(),
                "Admin",
                "Admin");
    }

    private Company createCompany() {
        Company company = new Company();
        company.setId(new Random(1L).nextLong());
        company.setName("Company" + UUID.randomUUID());
        company.setCreatedDate(LocalDateTime.now());
        company.setModifiedDate(LocalDateTime.now());
        company.setCreatedBy("Admin");
        company.setModifiedBy("Admin");
        Country country = createDummyCountry();
        company.setCountry(country);
        company.setCountryId(country.getId());
        return company;
    }

}
