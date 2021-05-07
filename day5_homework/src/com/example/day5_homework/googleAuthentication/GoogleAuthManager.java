package com.example.day5_homework.googleAuthentication;

//Simulation
//This is imported microservice to our project, we did not write this package.
public class GoogleAuthManager {
    private String email;
    private String password;
    private int id;
    private String firstName;
    private String lastName;

    public GoogleAuthManager(String email, String password){
        this.email = email;
        this.password = password;
        if(checkEmailAndPassword()){
            getUserInformationBasedOnEmail();
        }else{
            System.out.println("Email or password is incorrect.");
        }
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    //Simulation
    private boolean checkEmailAndPassword(){
        return true;
    }

    //Simulation
    private void getUserInformationBasedOnEmail(){
        this.id = 10;
        this.firstName = "Jonas";
        this.lastName = "Kahnwald";
    }
}
