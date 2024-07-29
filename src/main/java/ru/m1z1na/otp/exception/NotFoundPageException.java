package ru.m1z1na.otp.exception;

public class NotFoundPageException extends NotFoundException {
    public NotFoundPageException(String message) {
        super(message);
    }
}