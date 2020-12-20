package com.company;
import java.util.List;
public interface LabClassUI {
    List<Student> students();
    void addStudent(Student student) throws EmptyStringException;
    void addStudents(List<Student> students);
    void sortByMark();
    Student getStudent(String name, String surname) throws StudentNotFoundException;
}
