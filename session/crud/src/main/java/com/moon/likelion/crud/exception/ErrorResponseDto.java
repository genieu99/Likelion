package com.moon.likelion.crud.exception;

public class ErrorResponseDto {
    private String message;

    public ErrorResponseDto() {
    }

    public ErrorResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "ErrorResponseDto{" +
                "message='" + message + '\'' +
                '}';
    }
}
