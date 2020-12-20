package com.company;

public class EmptyStringException extends Throwable {
    public EmptyStringException() {
        super("Student's personal info is missing");
    }
}
