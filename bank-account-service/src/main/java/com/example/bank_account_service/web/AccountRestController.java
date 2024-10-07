package com.example.bank_account_service.web;

import com.example.bank_account_service.dto.BankAccountRequestDTO;
import com.example.bank_account_service.dto.BankAccountResponseDTO;
import com.example.bank_account_service.entities.BankAccount;
import com.example.bank_account_service.mappers.AccountMapper;
import com.example.bank_account_service.repositories.BankAccountRepository;
import com.example.bank_account_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api") // ceci permet d'ajouter un chemain /api avant les autres chemins spécifiés par la suite
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @GetMapping("/bankAccounts")
    public List<BankAccount> getAllBankAccounts() {
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount getBankAccountById(@PathVariable String id) {
        return bankAccountRepository.findById(id).
                orElseThrow(()-> new RuntimeException(String.format("BankAccount %s not found ",id)));
    }

    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO saveBankAccount(@RequestBody BankAccountRequestDTO requestDTO) {
        return accountService.addBankAccount(requestDTO);
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccount updateBankAccount(@PathVariable String id, @RequestBody BankAccount bankAccount) {
        BankAccount account = bankAccountRepository.findById(id).orElseThrow();
        if (bankAccount.getBalance()   != null)   account.setBalance(bankAccount.getBalance());
        if (bankAccount.getCurrency()  != null)   account.setCurrency(bankAccount.getCurrency());
        if (bankAccount.getAccountStatus()    != null)   account.setAccountStatus(bankAccount.getAccountStatus());
        if (bankAccount.getCreatedAt() != null)   account.setCreatedAt(bankAccount.getCreatedAt());
        return bankAccountRepository.save(account);
    }

    @PostMapping("/bankAccounts/{id}")
    public void deleteBankAccount(@PathVariable String id) {
        bankAccountRepository.deleteById(id);
    }
}
