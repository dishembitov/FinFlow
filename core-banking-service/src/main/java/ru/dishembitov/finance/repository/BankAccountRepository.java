package ru.dishembitov.finance.repository;

import ru.dishembitov.finance.model.entity.BankAccountEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
    Optional<BankAccountEntity> findByNumber(String accountNumber);
}
