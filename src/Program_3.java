import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();

        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();

        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input. Marks should be between 0 to 100.");
            return;
        }

        // Calculate total marks
        // Calculate percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        double percentage = (double) totalMarks / 3;


        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("_______________________________");
        System.out.println("|                            |");
        System.out.println("|         Mark Sheet         |");
        System.out.println("|____________________________|");
        System.out.println("| Name      : " + name     + "|");
        System.out.println("| Roll No   : " + rollNo    +"|");
        System.out.println("|____________________________|");
        System.out.println("| Subjects  :   Marks        |");
        System.out.println("|____________________________|");
        System.out.println("| Math      :    + mathMarks|");
        System.out.println("| Science   :   " + scienceMarks+"|");
        System.out.println("| English   :   " + englishMarks+ "|");
        System.out.println("|____________________________|");
        System.out.println("| Total     :" + totalMarks +"|");
        System.out.println("|____________________________|");
        System.out.println("| Percentage:   " + percentage+ "|");
        System.out.println("| Result    :   " + result + "|");
        System.out.println("| Grade     :   " + grade +  "|");
        System.out.println("|_____________________________|");
        scanner.close();
    }
}
