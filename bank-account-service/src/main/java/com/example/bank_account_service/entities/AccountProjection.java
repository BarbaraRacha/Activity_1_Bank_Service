package com.example.bank_account_service.entities;

import com.example.bank_account_service.enums.AccountStatus;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public String getId();
    public AccountStatus getAccountStatus();
}
