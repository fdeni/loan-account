package com.project.loanaccount.service;

import com.project.loanaccount.data.request.LoanRequest;
import com.project.loanaccount.data.response.LoanInstallmentResponse;

import java.util.List;

public interface LoanService {
    public List<LoanInstallmentResponse> calculateInstallments(LoanRequest request);
}
