package by.it_academy;

public class Constants {
    // 456.454-(-53443-5653)
    //45-3
    public static final String PATTERN_NUMBERS = "-?\\d+(.\\d+)?";
    public static final String PATTERN_OPERATIONS = "(?<=[^(])[\\-+/*]";
    public static final String PATTERN_EXPRESSION =
            PATTERN_NUMBERS + PATTERN_OPERATIONS + "(\\()?" + PATTERN_NUMBERS + "(\\))?";
    public static final String COMMAND_STOP = "end";
}
