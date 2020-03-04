package com.knoldus.service;

import com.knoldus.repository.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    public List<Student> getStudentsWithNoSecondaryAddress(List<Student> listOfStudents) {
        return listOfStudents.stream().filter(student -> student.getAddress().getSecondaryAddress().isPresent()).collect(Collectors.toList());
    }

    public List<Student> getStudentsWithInitialOfUserAndNoSecAddress(List<Student> listOfStudents, String initialAlphabet) {
        List<Student> studentList = listOfStudents
                .stream()
                .filter(student -> student.getName().toLowerCase().startsWith(initialAlphabet.toLowerCase()))
                .collect(Collectors.toList());
        return getStudentsWithNoSecondaryAddress(studentList);
    }

}
