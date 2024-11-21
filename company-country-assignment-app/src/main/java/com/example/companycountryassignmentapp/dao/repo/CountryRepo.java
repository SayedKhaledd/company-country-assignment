package com.example.companycountryassignmentapp.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.companycountryassignmentapp.model.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {

    Country findByIsoCode(String isoCode);
}
