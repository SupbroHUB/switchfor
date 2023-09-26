package shubha;
import java.util.Scanner;

public class NewApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 10;

        for (int i = 1; i <= students; i++) {
            System.out.println("Enter the name of student " + i + ": ");
            String studentName = sc.nextLine();

            System.out.println("Enter attendance of student " + i + ": ");
            int attendance = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            int grade = 0; // Initialize grade within the loop

            if (attendance >= 90 && attendance <= 100) {
                grade = 1;
            } else if (attendance >= 80 && attendance < 90) {
                grade = 2;
            } else if (attendance >= 70 && attendance < 80) { // Changed from 70 < 60 to 70 < 80
                grade = 3;
            } else if (attendance >= 60 && attendance < 70) {
                grade = 4;
            } else if (attendance >= 45 && attendance < 60) { // Changed from 45 <= 60 to 45 < 60
                grade = 5;
            } else {
                System.out.println("Invalid attendance");
                continue; // Skip the rest of the loop for this student
            }

            switch (grade) {
                case 1:
                    System.out.println("Grade A");
                    break;
                case 2:
                    System.out.println("Grade B");
                    break;
                case 3:
                    System.out.println("Grade C");
                    break;
                case 4:
                    System.out.println("Grade D");
                    break;
                case 5:
                    System.out.println("Grade E");
                    break;
                default:
                    System.out.println("Invalid grade");
            }
        }
        sc.close();
    }
}
