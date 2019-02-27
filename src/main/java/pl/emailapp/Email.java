package pl.emailapp;

import lombok.Data;

import java.util.Scanner;

@Data


public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "wow-company.com";


    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Your department is: " + this.department);
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
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

    // Generate a random password
    private String randomPassword (int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXZ0123456789!@#$%&*";
        char [] password = new char [length];
        for (int i = 0; i <length ; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    public void setMailboxCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail (String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public void changePassword (String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }


}
