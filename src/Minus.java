public class Minus {
    public static String subtract(String str1, String str2) {
        validateString(str1);
        validateString(str2);
        String imput = str1 + " - " + str2;
        String result = imput;


        String[] parts = result.split(" - ", 2);

        if (parts.length == 2) {
            String originalString = parts[0].trim().replace("\"", "");
            String substringToRemove = parts[1].trim().replace("\"", "");


            return subtractSubstring(originalString, substringToRemove);
        } else {
            throw new IllegalArgumentException("Некорректный ввод. Используйте формат 'строка1 - строка2'.");
        }
    }

    private static String subtractSubstring(String original, String toRemove) {

        String result = original.replace(toRemove, "");


        return result.isEmpty() ? "" : result;
    }
    private static void validateString(String textInput) {
        if (!textInput.startsWith("\"") || !textInput.endsWith("\"") || textInput.length() > 12) {
            throw new IllegalArgumentException("Строка должна быть в двойных кавычках и длиной не более 10 символов.");
        }
    }
}
