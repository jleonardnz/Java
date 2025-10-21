//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
src/
├── domain/
│   └── MortgageData.java
├── application/
│   └── MortgageCalculator.java
├── adapter/
│   ├── input/
│   │   └── ConsoleMortgageInput.java
│   └── output/
│       └── ConsoleMortgageOutput.java
└── Main.java
*/

import adapter.input.ConsoleValueReader;
import application.Ports.Inbound.IValueReader;
import adapter.input.ConsoleMortgageInput;
import adapter.output.ConsoleMortgageOutput;
import application.MortgageCalculator;
import domain.MortgageData;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    IValueReader valueReader = new ConsoleValueReader();
    // scanner = new Scanner(System.in);

    ConsoleMortgageInput input = new ConsoleMortgageInput(valueReader);
    ConsoleMortgageOutput output = new ConsoleMortgageOutput();
    MortgageCalculator calculator = new MortgageCalculator();

    float principal = input.getPrincipal();
    float rate = input.getAnnualInterestRate();
    short period = input.getPeriodYears();

    MortgageData data = new MortgageData(principal, rate, period);
    float monthlyPayment = calculator.calculateMonthlyPayment(data);

    output.showValue(monthlyPayment);
    output.showFormattedValue(String.format("$%.2f", monthlyPayment));
}
