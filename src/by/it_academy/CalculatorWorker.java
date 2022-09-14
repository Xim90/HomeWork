package by.it_academy;

import static by.it_academy.Constants.*;

public class CalculatorWorker {
    private final Parser parser;
    private final Operations operations;

    public CalculatorWorker(Parser parser, Operations operations) {
        this.parser = parser;
        this.operations = operations;
    }

    public double calc(String expression) throws RuntimeException {
        double[] numbers = parser.getNumbers(expression);
        String operation = parser.getOperation(expression);
        return switch (operation) {
            case "-" -> operations.subtract(numbers[0], numbers[1]);
            case "+" -> operations.add(numbers[0], numbers[1]);
            case "*" -> operations.multiply(numbers[0], numbers[1]);
            case "/" -> operations.divide(numbers[0], numbers[1]);
            default -> throw new RuntimeException(OPERATION_NOT_FOUND);
        };
    }
}
