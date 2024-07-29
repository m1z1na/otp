package ru.m1z1na.otp.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.*;
import java.util.UUID;

@Builder
public record GenerateDto(
    @ApiModelProperty(value = "Идентификатор процесса")
    @NotNull(message = "Идентификатор процесса не может быть пустым")
    UUID processId,

    @ApiModelProperty(value = "Идентификатор телеграм чата")
    @NotEmpty(message = "Идентификатор телеграм чата не может быть пустым")
    String telegramChatId,

    @ApiModelProperty(value = "Идентификатор телеграм чата")
    @NotEmpty(message = "Идентификатор телеграм чата не может быть пустым")
    String message,//строка текст сообщения (должен содержать '%s', куда будет подставляться пароль, но наличие плейсхолдера валидировать не нужно)

    @ApiModelProperty(value = "Одноразовый пароль")
    @NotNull(message = "Одноразовый пароль не может быть пустым")
    @Range(min = 1000, max = 9999999, message = "Длина одноразового пароля не может быть меньше 4 и больше 8")
    int length,

    @ApiModelProperty(value = "Время жизни одноразового пароля в секундах")
    @NotNull(message = "Время жизни одноразового пароля в секундах не может быть пустым")
    @Range(min = 30, max = 2147483646, message = "Время жизни одноразового пароля в секундах не может быть меньше 30")
    int ttl,

    @ApiModelProperty(value = "Время жизни одноразового пароля в секундах")
    @NotNull(message = "Время жизни одноразового пароля в секундах не может быть пустым")
    @Range(min = 1, max = 3, message = "Время жизни одноразового пароля в секундах не может быть меньше 30")
    int resendAttempts,

    @ApiModelProperty(value = "Таймаут")
    @NotNull(message = "Таймаут не может быть пустым")
    @Range(min = 30, max = 2147483646, message = "Время жизни одноразового пароля в секундах не может быть меньше 30")
    int resendTimeout
) {
}
