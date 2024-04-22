/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registationpage;
//Khutso Mashweshwe
//ST10447529

/**
 *
 * @author ST10447529
 */

import java.util.Scanner;//it’s used for reading input from various sources, including user input from the console

public class RegistationPage {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***************#################");//*A decor feature
        System.out.println("Welcome to the registration page");
        System.out.println("###############*****************");//*A decor feature

        String username;
        do {
            System.out.println("Please enter your username"); //Prompts the user to enter/create a username
            username = scanner.nextLine();

            if (!username.contains("_") || username.length() > 5) {
                System.out.println("Username is not correctly formatted. Please ensure it does not have more than 5 characters."); // gives the user feedback that input does not meet the requirement
            } else {
                System.out.println("Username successfully captured");// gives feedback that the is successfully captured
                break;//terminates the loop when all conditions are met
            }
        } while (true);//loops through a block of code as long as a specified of the username condition is true

        String firstName;
        do {
            System.out.println("Please enter your first name");//prompts or asks for the users first name
            firstName = scanner.nextLine();

            if (firstName.contains(".(A-B.)") || firstName.length() > 15) {
                System.out.println("First name is not formatted correctly. Please ensure that it does not contain special characters and is not more than 15 characters.");
            } else {
                System.out.println("First name successfully captured");//Gives the user feedback that their first name is succefully captured 
                break;//terminates the loop when all conditions are met
            }
        } while (true);//loops through a block of code as long as a specified of the firstname condition is true

        String lastName;
        do {
            System.out.println("Please enter your last name");//promts the to provide their last name
            lastName = scanner.nextLine();

            if (lastName.contains("(.A-B.)") || lastName.length() > 15) {
                System.out.println("Last name is not formatted correctly. Please ensure that it does not contain special characters and is not more than 15 characters.");
            } else {
                System.out.println("Last name successfully captured");//Gives the user feedback that their last name is succefully captured
                break;
            }
        } while (true);//it will repeat the loop as long as the condition is true

        String password;
        boolean passwordValidated = false;
        do {
            System.out.println("Please enter your password");//promts or asks the user to create a password 
            password = scanner.nextLine();

            String upperCase = "(.[A-Z].)";// calling the objects that would be used to determing the password validation 
            String lowerCase = "(.[a-z].)";// calling the objects that would be used to determing the password validation 
            String digits = "(.[0-9].)";// calling the objects that would be used to determing the password validation 
            String specialChars = "(.[!@#$%^&+].)";// calling the objects that would be used to determing the password validation 

            if (password.length() <= 8) {
                System.out.println("Password is not formatted correctly. Please ensure it is at least 8 characters long.");//sets the condition in which the user needs to meet in terms of the length it should be 8
            } else if (!password.matches(upperCase)) {
                System.out.println("Password is not formatted correctly. Please ensure it contains at least one uppercase letter.");//sets the condition in which the user needs to meet in terms of using 1 uppercase 
            } else if (!password.matches(lowerCase)) {
                System.out.println("Password is not formatted correctly. Please ensure it contains at least one lowercase letter.");//sets the condition in which the user needs to meet in terms of using lower cases
            } else if (!password.matches(digits)) {
                System.out.println("Password is not formatted correctly. Please ensure it contains at least one digit.");//sets the condition in which the user needs to meet in terms of 1 int digit
            } else if (!password.matches(specialChars)) {
                System.out.println("Password is not formatted correctly. Please ensure it contains at least one special character.");//sets the condition in which the user needs to meet in terms of special characters
            } else {
                System.out.println("Password successfully captured");//Gives the user feedback that their password is succefully captured and meets the requirments
                passwordValidated = true;//Validates the password whether it is true
            }
        } while (!passwordValidated);//it will repeat the loop as long as the condition is true
        //now we move on the next page which is the login page 
        System.out.println("#############****************");
        System.out.println("# Welcome to the login page #");
        System.out.println("*************################");

        String loginUsername;
        do {
            System.out.println("To login, please enter your username");//prompts the user enter their username which they created before
            loginUsername = scanner.nextLine();

            if (loginUsername.equals(username)) {
                System.out.println("Username is correct");//gives feedback that the username entered is correct and matchs
                break;//terminates the loop when the username entered is true or is correct
            } else {
                System.out.println("Username is incorrect. Please try again.");//gives feedback that the username does not match with the one created before
            }
        } while (true);

        String loginPassword;
        do {
            System.out.println("Please enter your password");
            loginPassword = scanner.nextLine();

            if (loginPassword.equals(password)) {
                System.out.println("Password is correct");//gives feedback that the password entered is correct and matchs
                System.out.println("hello " + firstName + " " + lastName + ". We are pleased to see you again");
                break;//terminates the loop when the password entered is true or is correct
            } else {
                System.out.println("Password is incorrect. Please try again.");//gives feedback that the password does not match with the one created before
            }
        } while (true);

        System.out.println("Press any key to exit");
        scanner.nextLine();
        System.out.println("Come back soon");
        //Khutso Mashweshwe
        //ST10447529
    }
}
