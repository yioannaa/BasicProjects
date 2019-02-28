package pl.studentDataApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    private String StudentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;

    public Student() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter student grade: ");
        this.grade = scanner.nextInt();

        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.StudentID = grade + "" + id;
        System.out.println("Student ID: " + StudentID);

    }

    public void enroll() {

        do {
            System.out.println("Courses: Chemistry, Computer Science, English, History, Mathematics.\n" +
                    "Enter a course name to enroll. Press Q to quit.");

            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else {
                break;
            }
        }
        while (1 != 0);

            System.out.println("ENROLLED IN: " + courses);
            System.out.println("TUITION BALANCE: " + tuitionBalance);




    }

}
