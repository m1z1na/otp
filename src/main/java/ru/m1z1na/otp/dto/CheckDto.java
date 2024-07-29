package ru.m1z1na.otp.dto;

import lombok.*;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.*;
import java.util.UUID;

@Builder
public record CheckDto(
        @NotNull(message = "UUID не может быть пустым")
        UUID processId,
        @NotNull(message = "Одноразовый крд не может быть пустым")
        @Range(min = 1000, max = 99999999, message = "Длина одноразового пароля не может быть меньше 4 и больше 8")
        int otp) {
}

