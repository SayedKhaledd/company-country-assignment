package com.example.companycountryassignmentapp.service;

import com.example.companycountryassignmentapp.model.Company;
import com.example.companycountryassignmentapp.dto.CompanyDto;
import com.example.companycountryassignmentapp.transformer.CompanyTransformer;
import com.example.companycountryassignmentapp.dao.CompanyDao;
import com.example.backendcoreservice.service.AbstractService;

public interface CompanyService extends AbstractService<Company, CompanyDto, CompanyTransformer, CompanyDao> {

}
