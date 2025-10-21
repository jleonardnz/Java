package adapter.input;

import application.Ports.Inbound.IValueReader;
import java.util.Scanner;

public class ConsoleValueReader implements IValueReader {

    private final Scanner scanner = new Scanner(System.in);

    public float GetFloatValue(String prompt, float defaultValue) {
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

    public short GetShortValue(String prompt, short defaultValue) {
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
