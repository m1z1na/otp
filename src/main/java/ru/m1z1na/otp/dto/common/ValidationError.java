package ru.m1z1na.otp.dto.common;

import lombok.Builder;

@Builder
public record ValidationError(String field, String message) {
}