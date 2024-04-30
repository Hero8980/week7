import java.util.Scanner;

public class AlphabetSymbolProgran12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        char input = scanner.next().charAt(0);

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("Input is an alphabet.");
        }

        else if (input >= '0' && input <= '9') {
            System.out.println("Input is a number");
        }

        else {
            System.out.println("Input is a symbol");
        }

        scanner.close();
    }
}