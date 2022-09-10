package by.it_academy;

public class Calculator {
    private final Parser parser;

    public Calculator(Parser parser) {
        this.parser = parser;
    }

    public double calc(String expression) {
        String[] numbers = parser.getNumbers(expression);
        String operation = parser.getOperation(expression);
        double number1 = Double.parseDouble(numbers[0].replace("(","").replace(")",""));
        double number2 = Double.parseDouble(numbers[1].replace("(","").replace(")",""));
        switch (operation) {
            case "-":
                return number1 - number2;
            case "+":
                return number1 + number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
        }
        throw new RuntimeException("операция не найдена");
    }
}