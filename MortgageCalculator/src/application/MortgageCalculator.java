package application;

import domain.MortgageData;

public class MortgageCalculator {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    public float calculateMonthlyPayment(MortgageData data) {
        float principal = data.getPrincipal();
        float annualRate = data.getAnnualInterestRate();
        short years = data.getPeriodYears();

        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        int totalPayments = years * MONTHS_IN_YEAR;

        return (float) (
                principal * monthlyRate /
                        (1 - Math.pow(1 + monthlyRate, -totalPayments))
        );
    }
}

