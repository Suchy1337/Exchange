package com.msuchan.exchange.usecase;

import com.msuchan.exchange.model.ExchangeResult;

import java.math.BigDecimal;

public interface ExchangeCurrencyUseCase {
    /**
     * Exchanges the value in Polish Zloty's to desired currency.
     *
     * @param  desiredCurrency  currency in ISO 4217 standard to which the value should be exchanged
     * @param  value value in Polish Zloty's to exchange
     * @return      the exchange result
     */
    ExchangeResult exchangeCurrency(String desiredCurrency, BigDecimal value);
}
