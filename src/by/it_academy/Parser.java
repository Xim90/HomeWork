package by.it_academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.it_academy.Constants.*;

public class Parser {
    public String[] getNumbers(String expression) {
        return expression.split(PATTERN_OPERATIONS);
    }

    public String getOperation(String expression) {
        Pattern pattern = Pattern.compile(PATTERN_OPERATIONS);
        Matcher matcher = pattern.matcher(expression);
        String x = "";
        while (matcher.find()) {
            x = matcher.group();
        }
        return x;
    }
}
