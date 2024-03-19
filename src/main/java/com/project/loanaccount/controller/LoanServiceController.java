package com.project.loanaccount.controller;

import com.project.loanaccount.data.request.LoanRequest;
import com.project.loanaccount.data.response.BaseResponse;
import com.project.loanaccount.data.response.LoanInstallmentResponse;
import com.project.loanaccount.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class LoanServiceController {

    @Autowired
    private LoanService loanService;

    @PostMapping(path = "/calculate-loan", consumes = MediaType.APPLICATION_JSON_VALUE)
    private BaseResponse<List<LoanInstallmentResponse>> calculateLoan(@RequestBody LoanRequest request) {
        return BaseResponse.<List<LoanInstallmentResponse>>builder()
                .data(loanService.calculateInstallments(request))
                .status(HttpStatus.OK.value())
                .build();
    }
}
