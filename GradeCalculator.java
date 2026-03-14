import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } 
        else if (average >= 75) {
            System.out.println("Grade: B");
        } 
        else if (average >= 60) {
            System.out.println("Grade: C");
        } 
        else if (average >= 50) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
