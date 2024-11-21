package com.example.companycountryassignmentapp.service;

import com.example.companycountryassignmentapp.dao.CountryDao;
import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.model.Country;
import com.example.companycountryassignmentapp.transformer.CountryTransformer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryDao countryDao;
    private final CountryTransformer countryTransformer;

    @Override
    public CountryDao getDao() {
        return countryDao;
    }

    @Override
    public CountryTransformer getTransformer() {
        return countryTransformer;
    }

    @Override
    public String getEntityName() {
        return Country.class.getSimpleName();
    }

    @Override
    public CountryDto findByIsoCode(String isoCode) {
        log.info("CountryService: findByIsoCode - was called with isoCode: {}", isoCode);
        return getTransformer().transformEntityToDto(getDao().findByIsoCode(isoCode));
    }


}
