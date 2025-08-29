package ru.dishembitov.finance.service;

import ru.dishembitov.finance.exception.EntityNotFoundException;
import ru.dishembitov.finance.model.dto.BankAccount;
import ru.dishembitov.finance.model.dto.UtilityAccount;
import ru.dishembitov.finance.model.entity.BankAccountEntity;
import ru.dishembitov.finance.model.entity.UtilityAccountEntity;
import ru.dishembitov.finance.model.mapper.BankAccountMapper;
import ru.dishembitov.finance.model.mapper.UtilityAccountMapper;
import ru.dishembitov.finance.repository.BankAccountRepository;
import ru.dishembitov.finance.repository.UtilityAccountRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).orElseThrow(EntityNotFoundException::new);
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).orElseThrow(EntityNotFoundException::new);
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id) {
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).orElseThrow(EntityNotFoundException::new));
    }

}
