package com.example.companycountryassignmentapp.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.companycountryassignmentapp.dao.repo.CompanyRepo;

@Component
@AllArgsConstructor
public class CompanyDaoImpl implements CompanyDao {

    private final CompanyRepo companyRepo;

    @Override
    public CompanyRepo getRepo() {
        return companyRepo;
    }


}
