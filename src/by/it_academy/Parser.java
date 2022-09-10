package by.it_academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Parser {
    public String[] getNumbers(String expression) {
        return expression.split(Constants.PATTERN_OPERATIONS);
    }
    public String getOperation(String expression) {
        Pattern pattern = Pattern.compile(Constants.PATTERN_OPERATIONS);
        Matcher matcher = pattern.matcher(expression);
        String x ="";
        while (matcher.find()) {
            x = matcher.group();
        }
        return x;
    }
}
