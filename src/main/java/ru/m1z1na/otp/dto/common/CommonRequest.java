package ru.m1z1na.otp.dto.common;

import lombok.Builder;
import javax.validation.Valid;

@Builder
public record CommonRequest<T>(@Valid T body) {
}
