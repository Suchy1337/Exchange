package com.msuchan.exchange.usecase;

import com.msuchan.exchange.model.ExchangeResult;
import com.msuchan.exchange.validators.CurrencyFormatValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class ExchangeCurrencyUseCaseImpl implements ExchangeCurrencyUseCase{

    private final CurrencyFormatValidator currencyFormatValidator;

    @Override
    public ExchangeResult exchangeCurrency(String currency, BigDecimal value) {
        currencyFormatValidator.validateCurrencyFormat(currency);
        return null;
    }
}
