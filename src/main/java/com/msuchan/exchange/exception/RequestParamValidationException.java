package com.msuchan.exchange.exception;

import com.msuchan.exchange.model.ExceptionDetails;
import lombok.Getter;

import java.util.List;

@Getter
public class RequestParamValidationException extends RuntimeException{
    private final String title;
    private final List<ExceptionDetails> details;

    public RequestParamValidationException(String title, String message, List<ExceptionDetails> details){
        super(message);
        this.title = title;
        this.details = details;
    }

}
