package adapter.input;

import application.Ports.Inbound.IValueReader;

public class  ConsoleMortgageInput {

    final float DEFAULT_PRINCIPAL = 100_000;
    final float DEFAULT_ANNUAL_INTEREST_RATE = 3.92F;
    final short DEFAULT_PERIOD = 30;  // Years

    private final IValueReader valueReader;

    public ConsoleMortgageInput(IValueReader valueReader) {
        this.valueReader = valueReader;
    }

    public float getPrincipal() {
        return valueReader.GetFloatValue("Enter principal amount: ", DEFAULT_PRINCIPAL);
    }

    public float getAnnualInterestRate() {
        return valueReader.GetFloatValue("Enter annual interest rate: ", DEFAULT_ANNUAL_INTEREST_RATE);
    }

    public short getPeriodYears() {
        return valueReader.GetShortValue("Enter period in years: ", DEFAULT_PERIOD);
    }
}

