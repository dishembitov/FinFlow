package ru.dishembitov.finance.exception;

public class InsufficientFundsException extends SimpleBankingGlobalException {
    public InsufficientFundsException(String message, String code) {
        super(message, code);
    }
}
