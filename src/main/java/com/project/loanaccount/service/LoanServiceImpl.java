package com.project.loanaccount.service;

import com.project.loanaccount.data.request.LoanRequest;
import com.project.loanaccount.data.response.LoanInstallmentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {
    private static final Logger logger = LoggerFactory.getLogger(LoanServiceImpl.class);

    private static final int MONTH_OF_YEAR = 12;
    private static final int DIV_PERCENT = 100;
    private static final int DAY_OF_YEAR = 360;
    private static final int DAY_OF_MONTH = 30;

    @Override
    public List<LoanInstallmentResponse> calculateInstallments(LoanRequest request) {
        logger.info("Entered in method-calculateInstallments of class-LoanServiceImpl at {}", System.currentTimeMillis());
        logger.info("loan request :{}", request);

        double amount = request.getAmount();
        int tenor = request.getTenor();
        double interestRate = request.getInterestRate();
        LocalDate startDate = request.getStartDate();

        List<LoanInstallmentResponse> installments = new ArrayList<>();

        double monthlyInterestRate = interestRate / DIV_PERCENT / MONTH_OF_YEAR;
        double monthlyPayment = (amount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -tenor));
        double remainingPrincipal = amount;

        for (int i = 1; i <= tenor; i++) {
            double interestPayment = (interestRate / DIV_PERCENT / DAY_OF_YEAR) * DAY_OF_MONTH * remainingPrincipal;
            double principalPayment = monthlyPayment - interestPayment;
            remainingPrincipal -= principalPayment;

            LoanInstallmentResponse installment = new LoanInstallmentResponse(
                    i,
                    startDate.plusMonths(i),
                    String.format("%.2f", monthlyPayment),
                    String.format("%.0f", principalPayment),
                    String.format("%.0f", interestPayment),
                    String.format("%.0f", Math.abs(remainingPrincipal))
            );

            installments.add(installment);
        }

        logger.info("loan response {}", installments);
        return installments;
    }
}
