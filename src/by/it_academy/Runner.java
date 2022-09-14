package by.it_academy;

import java.util.Scanner;

import static by.it_academy.Constants.*;
import static java.lang.System.*;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        CalculatorWorker calculatorWorker = new CalculatorWorker(new Parser(), new Operations());
        String expression = "";
        while (!expression.toLowerCase().matches(COMMAND_STOP)) {
            expression = scanner.next();
            if (expression.matches(PATTERN_EXPRESSION)) {
                try {
                    out.printf(PRINT_DOUBLE_FORMAT, calculatorWorker.calc(expression));
                } catch (RuntimeException e) {
                    out.println(e.getMessage());
                }
            } else {
                if (!expression.toLowerCase().matches(COMMAND_STOP)) {
                    out.println(INCORRECT_INPUT);
                }
            }
        }
    }
}
