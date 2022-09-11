package by.it_academy;

import static by.it_academy.Constants.*;

public class Calculator {
    private final Parser parser;

    public Calculator(Parser parser) {
        this.parser = parser;
    }

    public double calc(String expression) throws RuntimeException {
        double[] numbers = parser.getNumbers(expression);
        String operation = parser.getOperation(expression);
        switch (operation) {
            case "-":
                return numbers[0] - numbers[1];
            case "+":
                return numbers[0] + numbers[1];
            case "*":
                return numbers[0] * numbers[1];
            case "/":
                if (numbers[1] == 0) {
                    throw new RuntimeException(DIVISION_ZERO);
                } else {
                    return numbers[0] / numbers[1];
                }
        }
        throw new RuntimeException(OPERATION_NOT_FOUND);
    }
}
