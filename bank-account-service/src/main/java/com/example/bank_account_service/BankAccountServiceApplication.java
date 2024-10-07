package com.example.bank_account_service;

import com.example.bank_account_service.entities.BankAccount;
import com.example.bank_account_service.entities.Customer;
import com.example.bank_account_service.enums.AccountStatus;
import com.example.bank_account_service.repositories.BankAccountRepository;
import com.example.bank_account_service.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository){
		return args -> {
			Stream.of("Mohamed", "Yassine", "Hanae", "Imane").forEach(c -> {
				Customer customer = Customer.builder()
						.name(c)
						.build();

				customerRepository.save(customer);
			});

			customerRepository.findAll().forEach(customer -> {
				for(int i=0; i<2; i++){
					BankAccount bankAccount = BankAccount.builder()
							.id(UUID.randomUUID().toString())
							.createdAt(new Date())
							.accountStatus(Math.random()>0.5? AccountStatus.CURRENT_ACCOUNT: AccountStatus.SAVING_ACCOUNT)
							.balance(Math.random()*10000+90000)
							.currency("MAD")
							.customer(customer)
							.build();
					bankAccountRepository.save(bankAccount);
				}
			});
		};
	}

}
