package com.example.bank_account_service.web;

import com.example.bank_account_service.dto.BankAccountRequestDTO;
import com.example.bank_account_service.dto.BankAccountResponseDTO;
import com.example.bank_account_service.entities.BankAccount;
import com.example.bank_account_service.entities.Customer;
import com.example.bank_account_service.repositories.BankAccountRepository;
import com.example.bank_account_service.repositories.CustomerRepository;
import com.example.bank_account_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccountGraphQLController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountService accountService;

    @QueryMapping
    private List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    private BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById(id).orElse(null);
    }

    @MutationMapping
    private BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addBankAccount(bankAccount);
    }

    @MutationMapping
    private BankAccountResponseDTO updateAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount){
        return accountService.updateBankAccount(id, bankAccount);
    }

    @MutationMapping
    private Boolean deleteAccount(@Argument String id){
        bankAccountRepository.deleteById(id);
        return true;
    }


    @QueryMapping
    private List<Customer> customers(){
        return customerRepository.findAll();
    }
}

// déjà crée: record BankAccountDTO(Double balance, AccountStatus accountStatus, String currency);
