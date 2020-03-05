package com.knoldus.service;

import com.knoldus.repository.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentService {

    public List<Student> getStudentsWithNoSecondaryAddress(List<Student> listOfStudents) {
        return listOfStudents
                .stream()
                .filter(student -> student.getAddress().getSecondaryAddress().isPresent())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsWithInitialOfUserAndNoSecAddress(
            List<Student> listOfStudents, String initialAlphabet) {
        Stream<Student> studentStream = listOfStudents
                .stream()
                .filter(student -> student.getName().toLowerCase().startsWith(initialAlphabet.toLowerCase()));
        return studentStream.filter(student -> !(student.getAddress().getSecondaryAddress().isPresent())).collect(Collectors.toList());
    }

}
