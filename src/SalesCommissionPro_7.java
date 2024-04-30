import java.util.Scanner;

public class SalesCommissionPro_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double commission = 0;
        if (salesAmount >= 50000) {
            commission = 0.35 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.20 * salesAmount;
        } else if (salesAmount >= 20000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 10000) {
            commission = 0.05 * salesAmount;
        } else {
            commission = 0.02 * salesAmount;
        }

        System.out.println("______________________________ ");
        System.out.println("|           Sales Commissio    |");
        System.out.println("|______________________________|");
        System.out.println("Sales ID          : " + salesId);
        System.out.println("Seller's Name     : " +sellerName);
        System.out.println("Sales Amount      : " + salesAmount);
        System.out.println("Basic Salary      : " + basicSalary);
        System.out.println( );
        System.out.println("Sales Commission  : " + commission);

        scanner.close();
    }
}
