package FizzBuzzHexagonal.Adapter.Input;

import java.util.Scanner;

public class ConsoleValueReader implements IValueReader {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public short read(String prompt, short defaultValue) {
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
}
