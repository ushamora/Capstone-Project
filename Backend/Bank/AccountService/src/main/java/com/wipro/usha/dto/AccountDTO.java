package com.wipro.usha.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDTO {
    private Long id;
    private Long customerId;
    private String userName;
    private String panCardNum;
    private String aadhaarCardNum;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private Double loan;
}
