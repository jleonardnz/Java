package FizzBuzzHexagonal.Core.Domain;

public class  FizzBuzzRule implements IFizzBuzzRule {
    @Override
    public String evaluate(int value) {
        //if (value % 15 == 0) return "FizzBuzz";
        if (value % 3 == 0 && value % 5 == 0) return "FizzBuzz";
        if (value % 3 == 0) return "Fizz";
        if (value % 5 == 0) return "Buzz";
        return String.valueOf(value);
    }
}
