package adapter.input;

import java.util.Scanner;

public class ConsoleMortgageInput {

    private final Scanner scanner;

    public ConsoleMortgageInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public float getPrincipal() {
        System.out.print("Enter principal amount: ");
        return Float.parseFloat(scanner.nextLine());
    }

    public float getAnnualInterestRate() {
        System.out.print("Enter annual interest rate (%): ");
        return Float.parseFloat(scanner.nextLine());
    }

    public short getPeriodYears() {
        System.out.print("Enter period in years: ");
        return Short.parseShort(scanner.nextLine());
    }
}

