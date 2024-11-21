package com.example.companycountryassignmentapp.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.companycountryassignmentapp.model.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

}
