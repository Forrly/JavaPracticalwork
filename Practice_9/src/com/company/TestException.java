package com.company;

public class TestException {
    public static void main(String[] args)
            throws INNException {
        Client client1 = new Client("Isabella", "Allford",  "012345678969");
        System.out.println(client1);
        Client client2 = new Client("Lucas", "Ayrton", "123456789");
        System.out.println(client2);
    }
}
