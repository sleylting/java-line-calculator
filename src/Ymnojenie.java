public class Ymnojenie {
    static String multiply(String str, String numStr) {
        validateString(str);
        validateString2(numStr);
        int times = validateNumber(numStr);
        return str.repeat(times);
    }
    private static int validateNumber(String numStr) {
        try {
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 10) {
                throw new IllegalArgumentException("Число должно быть от 1 до 10 включительно.");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректный ввод числа.");
        }
    }

    private static void validateString(String textInput) {
        if (!textInput.startsWith("\"") || !textInput.endsWith("\"") || textInput.length() > 12) {
            throw new IllegalArgumentException("Строка должна быть в двойных кавычках и длиной не более 10 символов.");
        }
    }
    private static void validateString2(String textInput) {
        if (textInput.length() > 10) {
            throw new IllegalArgumentException("Вторая строка должна быть не более 10 символов.");
        }
    }

}