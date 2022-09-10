package by.it_academy;

import java.util.Scanner;
import static by.it_academy.Constants.*;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(new Parser());
        String expression = "";
        while (!expression.toLowerCase().matches(COMMAND_STOP)) {
            expression = scanner.next();
            if (expression.matches(PATTERN_EXPRESSION)) {
                try{System.out.printf(PRINT_DOUBLE_FORMAT, calculator.calc(expression));}
                catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                if (!expression.toLowerCase().matches(COMMAND_STOP)) {
                    System.out.println(INCORRECT_INPUT);
                }
            }
        }
    }
}
