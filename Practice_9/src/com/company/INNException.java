package com.company;

public class INNException extends Exception {
    public INNException() {
        super("There should be 12 digits in INN");
    }
}
