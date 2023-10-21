package com.msuchan.exchange.usecase;

import com.msuchan.exchange.model.ExchangeResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExchangeCurrencyUseCaseImpl implements ExchangeCurrencyUseCase{
    @Override
    public ExchangeResult exchangeCurrency(String desiredCurrency, BigDecimal value) {
        return null;
    }
}
