package com.example.companycountryassignmentapp.dao;

import com.example.companycountryassignmentapp.model.Country;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.companycountryassignmentapp.dao.repo.CountryRepo;

public interface CountryDao extends AbstractDao<Country, CountryRepo> {

    Country findByIsoCode(String isoCode);
}
