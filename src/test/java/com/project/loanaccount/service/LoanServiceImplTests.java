package com.project.loanaccount.service;

import com.project.loanaccount.data.request.LoanRequest;
import com.project.loanaccount.data.response.LoanInstallmentResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LoanServiceImplTests {
    @InjectMocks
    private LoanServiceImpl loanService;

    @Test
    public void calculateInstallments_shouldReturnSameData() {
        LoanRequest request = new LoanRequest();
        request.setAmount(10000000);
        request.setTenor(12);
        request.setInterestRate(5);
        request.setStartDate(LocalDate.of(2023, 8, 10));

        List<LoanInstallmentResponse> installments = loanService.calculateInstallments(request);

        // Test the first installment
        LoanInstallmentResponse firstInstallment = installments.get(0);
        assertEquals(1, firstInstallment.getNo());
        assertEquals("2023-09-10", firstInstallment.getDate().toString());
        assertEquals("856074.82", firstInstallment.getTotalPayment());
        assertEquals("814408", firstInstallment.getPrincipalPayment());
        assertEquals("41667", firstInstallment.getInterestPayment());
        assertEquals("9185592", firstInstallment.getRemainingPrincipal());

        // Test the last installment
        LoanInstallmentResponse lastInstallment = installments.get(installments.size() - 1);
        assertEquals(12, lastInstallment.getNo());
        assertEquals("2024-08-10", lastInstallment.getDate().toString());
        assertEquals("856074.82", lastInstallment.getTotalPayment());
        assertEquals("852523", lastInstallment.getPrincipalPayment());
        assertEquals("3552", lastInstallment.getInterestPayment());
        assertEquals("0", lastInstallment.getRemainingPrincipal());
    }
}
