import org.jetbrains.annotations.NotNull;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final float PRINCIPAL = 100_000;
    final float  ANNUAL_INTEREST_RATE = 3.92F;
    final short  PERIOD = 30;  // Years

    Scanner scanner = new Scanner(System.in);
    //while (true) {
        float actualPrincipal  = readFloatValue(scanner, "Principal (default to $100,000): ", PRINCIPAL);
        float actualAnnualRate = readFloatValue(scanner, "Annual rate (default to 3.92): ", ANNUAL_INTEREST_RATE);
        short actualPeriod     = readShortValue(scanner, "Period (default to 30 year): ", PERIOD);

        float mortgage = calculateMortgage(actualPrincipal, actualAnnualRate, actualPeriod);
        System.out.println("Mortgage: " + formattedCurrency(mortgage));
    //}
}

double readDoubleValue(@NotNull Scanner scanner, String prompt, double defaultValue)
{
    double result;

    System.out.print(prompt);
    String input = scanner.nextLine();
    try {
        result = Double.parseDouble(input);
    } catch (NumberFormatException e) {
        result = defaultValue;
    }

    return result;
}

float readFloatValue(@NotNull Scanner scanner, String prompt, float defaultValue) {
    float result;

    System.out.print(prompt);
    String input = scanner.nextLine();
    try {
        result = Float.parseFloat(input);
    } catch (NumberFormatException e) {
        result = defaultValue;
    }

    return result;
}

short readShortValue(Scanner scanner, String prompt, short defaultValue) {
    short result;

    System.out.print(prompt);
    String input = scanner.nextLine();
    try {
        result = Short.parseShort(input);
    } catch (NumberFormatException e) {
        result = defaultValue;
    }

    return result;
}

float calculateMortgage(float principal, float annualInterestRate, short period) {
    final byte MONTHS = 12;
    final byte PERCENT = 100;

    float r = annualInterestRate/PERCENT/MONTHS; // Monthly interest
    int   n = period * 12;

    /*
    M = P * ( r*(1 + r)^n / ((1 + r)^n) - 1 )

    M = mortgage
    P = Principal
    r = Monthly interest rate (Annual interest div by 12)
    n = Number of payments (Number of months you will be paying the loan)
    */

    double mortgage =  principal * ( ( (double)r *Math.pow(1+ (double)r, n) ) / ( Math.pow(1+ (double)r, n) - 1) );
    return (float)mortgage;
}

String formattedCurrency(double value) {
    return NumberFormat.getCurrencyInstance().format(value);
}

/*
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
        System.out.println("Hello word");
    }
}
*/