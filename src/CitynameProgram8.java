import java.util.Scanner;

public class CitynameProgram8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet >= 'A' && alphabet <= 'F') {
            switch (alphabet) {
                case 'A':
                    System.out.println("City name: London");
                    break;
                case 'B':
                    System.out.println("City name: India");
                    break;
                case 'C':
                    System.out.println("City name: Canada");
                    break;
                case 'D':
                    System.out.println("City name: Dubai");
                    break;
                case 'E':
                    System.out.println("City name: France");
                    break;
                case 'F':
                    System.out.println("City name: Russia");
                    break;
            }
        } else {
            System.out.println("Invalid entry");
        }
        scanner.close();
    }
}