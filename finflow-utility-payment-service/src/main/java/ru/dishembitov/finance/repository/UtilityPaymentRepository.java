package ru.dishembitov.finance.repository;

import ru.dishembitov.finance.model.dto.UtilityPayment;
import ru.dishembitov.finance.model.entity.UtilityPaymentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}
