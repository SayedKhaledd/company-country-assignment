package com.example.companycountryassignmentapp.controller;

import com.example.backendcoreservice.api.ApiResponse;
import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.companycountryassignmentapp.dto.CompanyDto;
import com.example.companycountryassignmentapp.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/company")
@AllArgsConstructor
public class CompanyController implements AbstractController<CompanyService, CompanyDto> {

    private final CompanyService companyService;
    private final ApiResponseBuilder<CompanyDto> apiResponseBuilder;


    @Override
    public CompanyService getService() {
        return companyService;
    }

    @Override
    public ApiResponseBuilder<CompanyDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }

    @GetMapping
    public ApiResponse<List<CompanyDto>> findAll() {
        return getApiResponseBuilder().buildSuccessResponse(getService().findAll());
    }


    @PostMapping()
    public ApiResponse<CompanyDto> createCompany(@RequestBody CompanyDto companyDto) {
        return getApiResponseBuilder().buildSuccessResponse(getService().create(companyDto));
    }


}
