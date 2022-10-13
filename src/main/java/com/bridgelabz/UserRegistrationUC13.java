package com.bridgelabz;

public class UserRegistrationUC13 {

    public static void main(String[] args) {
        // UC-13 Refactor the Code to use Lambda Function to validate User Entry
        //- Use Lambda Function to validate First
        //Name, Last Name, Email, Mobile, and Password

        UserRegistrationProblem addName=(String x, String y)->x+" "+y;// Create lambda expression from UserRegistration interface
        UserRegistrationProblem addEmail=(String x, String y)->x+y;
        UserRegistrationProblem addMobileNumber=(String a, String b)->a+b;
        UserRegistrationProblem addPassword=(String x, String y)->x+y;


        System.out.println("Welcome to the User Registration");
        System.out.println("Full Name is : "+addName.AddressBook("Tom", "Ben"));
        System.out.println("Email ID  is : "+addEmail.AddressBook("tom242","@gmail.com") );
        System.out.println("Mobile No.is : "+addMobileNumber.AddressBook("9695795784",""));
        System.out.println("Password is  : "+addPassword.AddressBook("Validate","@123"));
    }
}
