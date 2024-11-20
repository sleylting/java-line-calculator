public class Plus {
    public static String add(String str1, String str2) {
        validateString(str1);
        validateString(str2);
        return str1 + str2;

    }

    private static void validateString(String textInput) {
        if (!textInput.startsWith("\"") || !textInput.endsWith("\"") || textInput.length() > 12) {
            throw new IllegalArgumentException("Строка должна быть в двойных кавычках и длиной не более 10 символов.");
        }
    }
}