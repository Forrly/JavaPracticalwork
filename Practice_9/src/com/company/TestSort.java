package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSort {
    public static void main(String[] args)
            throws EmptyStringException, StudentNotFoundException {
        LabClassUI classUI = new LabClass().getClassUi();

        classUI.addStudent(new Student("Charlotte", "Bishop",  4.7));
        classUI.addStudent(new Student("Zoey", "Macduff",  4.1));
        classUI.addStudent(new Student("Elizabeth", "Marlow",  3.8));
        classUI.addStudent(new Student("Hannah", "Milton",  4.6));

        ArrayList<Student> testStudents= new ArrayList<Student>();
        testStudents.add(new Student("Isaac", "Carter", 3.5));
        testStudents.add(new Student("Henry", "Flatcher", 5.0));
        testStudents.add(new Student("Jacob", "Gill", 2.9));
//        testStudents.add(new Student("Mike", "", 2.0));
        classUI.addStudents(testStudents);
        System.out.println(classUI);

        classUI.sortByMark();
        System.out.println(classUI);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name and surname: ");
        System.out.println(classUI.getStudent(scanner.next(), scanner.next()));
    }
}
