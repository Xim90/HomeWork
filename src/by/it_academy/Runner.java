package by.it_academy;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(new Parser());
        String expression = "";
        while (!expression.matches(Constants.COMMAND_STOP)) {
            expression = scanner.next();
            if (expression.matches(Constants.PATTERN_EXPRESSION)) {
                System.out.printf("%5.2f\n",calculator.calc(expression));
            } else {
                if (!expression.matches(Constants.COMMAND_STOP)) {
                    System.out.println("неверный формат");
                }
            }
        }
    }
}
