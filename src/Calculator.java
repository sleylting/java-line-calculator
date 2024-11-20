import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static String calculatet(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Ввод не может быть пустым.");
        }


        String regex = "(\"[^\"]*\"|\\S+)\\s*([+\\-*/])\\s*(\"[^\"]*\"|\\S+)";
        Matcher matcher = Pattern.compile(regex).matcher(input);

        if (!matcher.find()) {
            throw new IllegalArgumentException("Неизвестный знак оператора или неверный формат ввода.");
        }


        String part1 = matcher.group(1);
        String znak = matcher.group(2);
        String part2 = matcher.group(3);


        return switch (znak) {
            case "+" -> Plus.add(part1, part2);
            case "-" -> Minus.subtract(part1, part2);
            case "*" -> Ymnojenie.multiply(part1, part2);
            case "/" -> Delenie.divide(part1, part2);
            default -> throw new IllegalArgumentException("Неизвестная операция.");
        };
    }

    static String truncateResult(String result) {
        return result.length() > 40 ? result.substring(0, 40) + "..." : result;
    }
}
