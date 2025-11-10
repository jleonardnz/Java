package FizzBuzzHexagonal.Adapter.Output;

public class ConsoleFizzBuzzOutput implements IConsoleFizzBuzzOutput {
    private final IValueWriter valueWriter;

    public ConsoleFizzBuzzOutput(IValueWriter valueWriter) {
        this.valueWriter = valueWriter;
    }

    public void showValue(String result) {
        valueWriter.write(result);
    }
}
