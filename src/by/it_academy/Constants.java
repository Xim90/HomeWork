package by.it_academy;

public class Constants {
    public static final String PATTERN_NUMBERS = "-?\\d+(.\\d+)?";
    public static final String PATTERN_OPERATIONS = "(?<=[^(])[\\-+/*]";
    public static final String PATTERN_EXPRESSION =
            PATTERN_NUMBERS + PATTERN_OPERATIONS + "(\\()?" + PATTERN_NUMBERS + "(\\))?";
    public static final String PRINT_DOUBLE_FORMAT = "%5.2f\n";
    public static final String RIGHT_BRACKET = ")";
    public static final String LEFT_BRACKET = "(";
    public static final String COMMAND_STOP = "end";
    public static final String INCORRECT_INPUT = "Некоректный ввод! Попробуйте еще";
    public static final String OPERATION_NOT_FOUND = "Ошибка! Операция не найдена";
    public static final String DIVISION_ZERO = "Ошибка! Деление на ноль";
}
