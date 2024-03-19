package com.project.loanaccount.data.request;

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
public class LoanRequest {
    @JsonProperty(value = "amount")
    private double amount;

    @JsonProperty(value = "tenor")
    private int tenor;

    @JsonProperty(value = "interestRate")
    private double interestRate;

    @JsonProperty(value = "startDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
}
