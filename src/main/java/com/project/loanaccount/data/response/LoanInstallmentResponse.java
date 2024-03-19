package com.project.loanaccount.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanInstallmentResponse {
    @JsonProperty(value = "no")
    private int no;

    @JsonProperty(value = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @JsonProperty(value = "totalPayment")
    private String totalPayment;

    @JsonProperty(value = "principalPayment")
    private String principalPayment;

    @JsonProperty(value = "interestPayment")
    private String interestPayment;

    @JsonProperty(value = "remainingPrincipal")
    private String remainingPrincipal;
}
