package lab4;

import java.util.Scanner;

public class PSUStudentInputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        try {
            UndergradStudent u = new UndergradStudent(age, gpa);
            GradStudent g = new GradStudent(age, gpa);
            System.out.println("Undergrad age: " + u.getAge());
            System.out.println("Grad age: " + g.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
