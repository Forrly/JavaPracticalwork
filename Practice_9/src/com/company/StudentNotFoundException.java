package com.company;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String student) {
        super(student + " was not found.");
    }
}
