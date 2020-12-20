package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        writeToFile(false);
        System.out.println();

        readFile();
        System.out.println("\n");

        System.out.println("The information in the file has been changed to the information you entered.");
        writeToFile(false);
        readFile();
        System.out.println("\n");

        System.out.println("Text entered from the keyboard is added to the end of the file.");
        writeToFile(true);
        System.out.println();
        readFile();

    }

    private static void writeToFile(boolean append) {
        try (FileWriter writer = new
                FileWriter("TextFile.txt", append)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to write to a file: ");

            String text = scanner.nextLine();
            writer.write(text);
            writer.flush();
            System.out.println("Your string was written in the file!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void readFile() {
        try (FileReader reader = new
                FileReader("TextFile.txt")) {
            int c;
            System.out.println("String from your text file:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
