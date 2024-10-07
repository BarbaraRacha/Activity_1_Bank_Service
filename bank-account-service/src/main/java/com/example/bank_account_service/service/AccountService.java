package com.example.bank_account_service.service;

import com.example.bank_account_service.dto.BankAccountRequestDTO;
import com.example.bank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addBankAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateBankAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
