import java.util.Scanner;

public class SymbolProgram10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();


        System.out.print("Enter symbol (+, -, /, *)");
        char symbol = scanner.next().charAt(0);

        double result = 0;
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
        } else {
            System.out.println("Invalid arithmetic symbol");
            return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
