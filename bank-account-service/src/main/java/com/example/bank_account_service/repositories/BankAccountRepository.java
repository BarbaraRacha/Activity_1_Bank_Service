package com.example.bank_account_service.repositories;

import com.example.bank_account_service.entities.BankAccount;
import com.example.bank_account_service.enums.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource // permet de créer les traitements de restController automatiquement en integrant une dépendance de "spring-data-rest" ...
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    // Cette méthode va etre utilisée automatiquemet par "spring-data-rest" en appelant
    // le lien "http://localhost:8081/bankAccounts/search/byType?t=SAVING_Account"
    @RestResource(path = "/byType")
    List<BankAccount> findByAccountStatus(@Param("t") AccountStatus status);
}
