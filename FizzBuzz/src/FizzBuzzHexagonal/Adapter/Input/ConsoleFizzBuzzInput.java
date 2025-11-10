package FizzBuzzHexagonal.Adapter.Input;

public class ConsoleFizzBuzzInput implements IConsoleFizzBuzzInput{
    private final IValueReader valueReader;

    public ConsoleFizzBuzzInput(IValueReader valueReader) {
        this.valueReader = valueReader;
    }

    public short getValue() {
        return valueReader.read("Enter a number (Default to 0): ", (short)0);
    }
}
