package com.example.bank_account_service.entities;

import com.example.bank_account_service.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @Getter @Setter
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private Double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    private String currency;
    @ManyToOne()
    private Customer customer;


}
