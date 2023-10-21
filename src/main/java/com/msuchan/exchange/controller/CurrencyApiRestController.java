package com.msuchan.exchange.controller;

import com.msuchan.exchange.api.CurrencyApi;
import com.msuchan.exchange.model.ExchangeResultDTO;
import com.msuchan.exchange.usecase.ExchangeCurrencyUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
public class CurrencyApiRestController implements CurrencyApi {

    private final ExchangeCurrencyUseCase exchangeCurrencyUseCase;

    @Override
    public ResponseEntity<ExchangeResultDTO> calculateCurrency(String desiredCurrency, BigDecimal value){
        final var result = exchangeCurrencyUseCase.exchangeCurrency(desiredCurrency, value);
        
        //TODO - Implement the functionality
        return ResponseEntity.ok(new ExchangeResultDTO().value(value));
    }
}
