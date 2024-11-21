package com.example.companycountryassignmentapp.service;

import com.example.companycountryassignmentapp.dao.CompanyDao;
import com.example.companycountryassignmentapp.dto.CompanyDto;
import com.example.companycountryassignmentapp.model.Company;
import com.example.companycountryassignmentapp.transformer.CompanyTransformer;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyDao companyDao;
    private final CompanyTransformer companyTransformer;
    private final CountryService countryService;

    @Override
    public CompanyDao getDao() {
        return companyDao;
    }

    @Override
    public CompanyTransformer getTransformer() {
        return companyTransformer;
    }

    @Override
    public String getEntityName() {
        return Company.class.getSimpleName();
    }

    @SneakyThrows
    @Override
    public Company doBeforeCreate(Company entity, CompanyDto dto) {
        log.info("CompanyService: doBeforeCreate - was called with entity: {} and dto: {}", entity, dto);
        entity.setCountry(countryService.findEntityById(dto.countryId()));
        return entity;
    }
}
