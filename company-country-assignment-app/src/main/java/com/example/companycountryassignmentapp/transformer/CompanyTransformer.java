package com.example.companycountryassignmentapp.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.companycountryassignmentapp.transformer.mapper.CompanyMapper;
import com.example.companycountryassignmentapp.dto.CompanyDto;
import com.example.companycountryassignmentapp.model.Company;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class CompanyTransformer implements AbstractTransformer<Company, CompanyDto, CompanyMapper> {

    private final CompanyMapper companyMapper;

    @Override
    public CompanyMapper getMapper() {
        return companyMapper;
    }


}
