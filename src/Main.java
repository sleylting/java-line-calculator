import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine().trim();
        scanner.close();

        try {
            String result = Calculator.calculatet(input).replaceAll("[\"]", "");
            System.out.println("Результат: " + "\"" + Calculator.truncateResult(result) + "\"");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }}