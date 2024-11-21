package com.example.companycountryassignmentapp.controller;

import com.example.backendcoreservice.api.ApiResponse;
import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.companycountryassignmentapp.dto.CountryDto;
import com.example.companycountryassignmentapp.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/country")
@AllArgsConstructor
public class CountryController implements AbstractController<CountryService, CountryDto> {

    private final CountryService countryService;
    private final ApiResponseBuilder<CountryDto> apiResponseBuilder;


    @Override
    public CountryService getService() {
        return countryService;
    }

    @Override
    public ApiResponseBuilder<CountryDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }


    @GetMapping("/all")
    public ApiResponse<List<CountryDto>> findAll() {
        return getApiResponseBuilder().buildSuccessResponse(getService().findAll());
    }

}
