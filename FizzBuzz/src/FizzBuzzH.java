/*
HEXAGONAL ARCHITECTURE

src/
└── com/
    └── fizzbuzz/
        ├── domain/
        │   ├── IFizzBuzzRule.java // FizzBuzzRule.java
        │   └── FizzBuzzRule.java  // FizzBuzzValue.java
        │
        ├── application/
        │   ├── IFizzBuzzService.java // IFizzBuzz.java
        │   └── FizzBuzzService.java
        │
        ├── adapter/
        │   ├── input/
        │   │   ├── IValueReader.java
        │   │   └── ConsoleValueReader.java
        │   ├── output/
        │   │   ├── IValueWriter.java
        │   │   └── ConsoleValueWriter.java
        │
        └── Main.java
*/

// Input - Driving
import FizzBuzzHexagonal.Adapter.Input.IValueReader;
import FizzBuzzHexagonal.Adapter.Input.ConsoleValueReader;
import FizzBuzzHexagonal.Adapter.Input.IConsoleFizzBuzzInput;
import FizzBuzzHexagonal.Adapter.Input.ConsoleFizzBuzzInput;

// Output - Driven
import FizzBuzzHexagonal.Adapter.Output.IValueWriter;
import FizzBuzzHexagonal.Adapter.Output.ConsoleValueWriter;
import FizzBuzzHexagonal.Adapter.Output.IConsoleFizzBuzzOutput;
import FizzBuzzHexagonal.Adapter.Output.ConsoleFizzBuzzOutput;

import FizzBuzzHexagonal.Core.Application.IFizzBuzzService;
import FizzBuzzHexagonal.Core.Application.FizzBuzzService;

import FizzBuzzHexagonal.Core.Domain.IFizzBuzzRule;
import FizzBuzzHexagonal.Core.Domain.FizzBuzzRule;

public class FizzBuzzH implements IFizzBuzz {
    public void Run() {
        IValueReader reader = new ConsoleValueReader();
        IConsoleFizzBuzzInput input = new ConsoleFizzBuzzInput(reader);

        IValueWriter writer = new ConsoleValueWriter();
        IConsoleFizzBuzzOutput output = new ConsoleFizzBuzzOutput(writer);

        IFizzBuzzRule rule = new FizzBuzzRule();
        IFizzBuzzService service = new FizzBuzzService(rule);

        short value = input.getValue();
        String result = service.evaluate(value);
        output.showValue(result);
    }
}
