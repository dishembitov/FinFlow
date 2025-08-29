package ru.dishembitov.finance.model.repository;

import ru.dishembitov.finance.model.entity.FundTransferEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}
