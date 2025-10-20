package domain;

public class MortgageData {
    private final float principal;
    private final float annualInterestRate;
    private final short periodYears;

    public MortgageData(float principal, float annualInterestRate, short periodYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.periodYears = periodYears;
    }

    public float getPrincipal() { return principal; }
    public float getAnnualInterestRate() { return annualInterestRate; }
    public short getPeriodYears() { return periodYears; }
}

