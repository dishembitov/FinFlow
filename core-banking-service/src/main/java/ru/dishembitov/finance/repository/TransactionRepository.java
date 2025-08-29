package ru.dishembitov.finance.repository;

import ru.dishembitov.finance.model.entity.TransactionEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
