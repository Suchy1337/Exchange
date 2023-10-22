package com.msuchan.exchange.controller;

import com.msuchan.exchange.exception.RequestParamValidationException;
import com.msuchan.exchange.model.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({ RequestParamValidationException.class })
    public ResponseEntity<ErrorObject> handleRequestParamValidationException(RequestParamValidationException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}
