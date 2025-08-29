package ru.dishembitov.finance.model.dto;

import lombok.Data;
import ru.dishembitov.finance.model.enums.Status;

@Data
public class UserUpdateRequest {
    private Status status;
}
