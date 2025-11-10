package adapter.output;

public class    ConsoleMortgageOutput {

    public void showValue(float value) {
        System.out.println("Monthly payment: " + value);
    }

    public void showFormattedValue(String value) {
        System.out.printf("Formatted monthly payment: %s%n", value);
    }
}

