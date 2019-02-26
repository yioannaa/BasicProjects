package pl.emailapp;

import lombok.Data;

@Data


public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;
}
