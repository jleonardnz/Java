package application;

import domain.MortgageData;

public class MortgageCalculator {

    public float calculateMonthlyPayment(MortgageData data) {
        float principal = data.getPrincipal();
        float annualRate = data.getAnnualInterestRate();
        short years = data.getPeriodYears();

        float monthlyRate = annualRate / 100 / 12;
        int totalPayments = years * 12;

        return (float) (
                principal * monthlyRate /
                        (1 - Math.pow(1 + monthlyRate, -totalPayments))
        );
    }
}

