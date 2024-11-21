package com.example.companycountryassignmentapp.service;

import com.example.backendcoreservice.service.AbstractService;
import com.example.companycountryassignmentapp.dao.CountryDao;
import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Country;
import com.example.companycountryassignmentapp.transformer.CountryTransformer;

public interface CountryService extends AbstractService<Country, CountryDto, CountryTransformer, CountryDao> {
    CountryDto findByIsoCode(String isoCode);
}
