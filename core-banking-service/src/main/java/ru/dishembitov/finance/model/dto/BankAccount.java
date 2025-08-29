package ru.dishembitov.finance.model.dto;

import ru.dishembitov.finance.model.enums.AccountStatus;
import ru.dishembitov.finance.model.enums.AccountType;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
