package com.example.companycountryassignmentapp.dao;

import com.example.companycountryassignmentapp.model.Country;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.companycountryassignmentapp.dao.repo.CountryRepo;

@Component
@AllArgsConstructor
public class CountryDaoImpl implements CountryDao {

    private final CountryRepo countryRepo;

    @Override
    public CountryRepo getRepo() {
        return countryRepo;
    }

    @Override
    public Country findByIsoCode(String isoCode) {
        return getRepo().findByIsoCode(isoCode);
    }
}
