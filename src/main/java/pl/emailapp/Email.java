package pl.emailapp;

import lombok.Data;

import java.util.Scanner;

@Data


public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;


    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
    }

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES:\n 1 for Sales \n 2 for Development \n 3 for Accouting \n" +
                "0 for none \n Enter department code:");

        Scanner scanner = new Scanner(System.in);

        int depChoice = scanner.nextInt();

        switch (depChoice){
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            case 0:
                return " ";
        }

        return " ";

    }


}
