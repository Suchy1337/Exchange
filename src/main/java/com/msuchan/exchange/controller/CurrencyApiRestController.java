package com.msuchan.exchange.controller;

import com.msuchan.exchange.api.CalculateCurrencyApi;
import com.msuchan.exchange.model.ExchangeResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyApiRestController implements CalculateCurrencyApi {

    @Override
    public ResponseEntity<ExchangeResult> calculateCurrency(String desiredCurrency, BigDecimal value, String actualCurrency){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
