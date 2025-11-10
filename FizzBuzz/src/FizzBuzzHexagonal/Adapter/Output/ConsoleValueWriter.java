package FizzBuzzHexagonal.Adapter.Output;

public class ConsoleValueWriter implements IValueWriter {
    @Override
    public void write(String value) {
        System.out.println(" Resultant: " + value);
    }
}
