package com.msuchan.exchange.validators;

import com.msuchan.exchange.exception.RequestParamValidationException;
import com.msuchan.exchange.model.ExceptionDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CurrencyFormatValidatorImpl implements CurrencyFormatValidator {

    private static final String CURRENCY_REGEX = "[A-Z]{3}";

    private static final Pattern CURRENCY_PATTERN = Pattern.compile(CURRENCY_REGEX);

    private static final int CURRENCY_LENGTH = 3;

    @Override
    public void validateCurrencyFormat(String currency) {
        Matcher matcher = CURRENCY_PATTERN.matcher(currency);
        if(currency.length() != CURRENCY_LENGTH || !matcher.matches()) {
            throw new RequestParamValidationException(
                    "incorrect_query_param",
                    "Provided query parameter is invalid.",
                    this.createDetails()
            );
        }
    }

    private List<ExceptionDetails> createDetails() {
        return List.of(new ExceptionDetails("request_param_criteria_is_not_met", "desiredCurrency parameter should be in ISO 4217 standard."));
    }
}
