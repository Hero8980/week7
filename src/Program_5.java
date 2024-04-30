import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();


        double HRA = basicSalary * 0.10;
        double TA = basicSalary * 0.08;
        double DA = basicSalary * 0.09;
        double PF = basicSalary * 0.20;

        double grossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("|______________________________________|");
        System.out.println("|           Salary Slip                |");
        System.out.println("|______________________________________|");
        System.out.println("| Employee Id    : " + empId  +       "|");
        System.out.println("| Employee Name  : " + empName+       "|");
        System.out.println("|______________________________________|");
        System.out.println("| Basic Salary   : " + basicSalary+   "|");
        System.out.println("| HRA 10%        : " + HRA +          "|" );
        System.out.println("| TA 8%          : " + TA +           "|");
        System.out.println("| DA 9%          : " + DA +           "|");
        System.out.println("| PF - 20%       : " + PF +           "|");
        System.out.println("|______________________________________|");
        System.out.println("| Gross Salary   : " + grossSalary+   "|");
        System.out.println("|======================================|");

        scanner.close();
    }
}
