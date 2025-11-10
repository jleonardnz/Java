/*
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println(String.format("Hello and welcome!"));

  for (int i = 1; i <= 5; i++) {
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    IO.println("i = " + i);
  }
}
*/

/*
IValueReader valueReader = new ConsoleValueReader();
IValueWriter valueWriter = new ConsoleValueWriter();

IFizzBuzzInput fizzBuzzInput = new FizzBuzzInput(valueReader);
IFizzBuzzOutput fizzBuzzOutput = new FizzBuzzOutput(valueWriter);

IFizzBuzzService fizzBuzz = new FizzBuzzService();

String inputValue = fizzBuzzInput.readValue();
String outputValue = fizzBuzz.get(inputValue);

fizzBuzzOutput.showValue(outputValue);
*/

void main(String[] args){
    IFizzBuzz fizzBuzzHexagonal = new FizzBuzzH();
    fizzBuzzHexagonal.Run();

    //IFizzBuzz fizzBuzzDDD = new FizzBuzzD();
    //fizzBuzzDDD.Run();
}