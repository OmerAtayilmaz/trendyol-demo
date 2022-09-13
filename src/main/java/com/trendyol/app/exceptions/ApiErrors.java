package com.trendyol.app.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ApiErrors {

    private String statusCode;
    private String message;
    private String type;

    public ApiErrors() {
    }

    public ApiErrors(String statusCode, String message, String type) {
        this.statusCode = statusCode;
        this.message = message;
        this.type = type;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
