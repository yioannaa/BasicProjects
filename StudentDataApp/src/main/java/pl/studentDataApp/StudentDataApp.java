package pl.studentDataApp;

import java.util.Scanner;

public class StudentDataApp {

    public static void main(String[] args) {

        System.out.println("Enter number of students you want to enroll");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        Student []students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {

            students [i]  = new Student();
            students[i].enroll();
            students[i].payTuition();

        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].showInfo());

        }



    }
}
