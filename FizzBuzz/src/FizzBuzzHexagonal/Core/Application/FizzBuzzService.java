package FizzBuzzHexagonal.Core.Application;

import FizzBuzzHexagonal.Core.Domain.IFizzBuzzRule;

public class FizzBuzzService implements IFizzBuzzService {
    private final IFizzBuzzRule rule;

    public FizzBuzzService(IFizzBuzzRule rule) {
        this.rule = rule;
    }

    @Override
    public String evaluate(short input) {
        //int value = Integer.parseInt(input); // Basic validation
        return rule.evaluate(input);
    }
}
