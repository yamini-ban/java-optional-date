package com.knoldus;

import com.knoldus.repository.Address;
import com.knoldus.repository.Student;
import com.knoldus.service.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class AppDriver {
    public static void main(String[] args) {
        Address address1 = new Address("California", null);
        Address address2 = new Address("Texas", "Delhi");

        Student s1 = new Student(1, "Rachel", 30, address1);
        Student s2 = new Student(2, "Ross", 30, address2);
        Student s3 = new Student(3, "Monica", 30, address1);
        Student s4 = new Student(4, "Chanandler", 30, address1);
        Student s5 = new Student(5, "Phoebe", 30, address2);
        Student s6 = new Student(6, "Yoey", 30, address1);
        Student s7 = new Student(7, "Gunther", 30, address1);
        Student s8 = new Student(8, "Mike", 30, address1);
        Student s9 = new Student(9, "Yleven", 30, address2);
        Student s10 = new Student(10, "Lucas", 30, address2);
        Student s11 = new Student(11, "Max", 30, address1);

        List<Student> listOfStudents = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);

        StudentService studentService = new StudentService();
        DateService dateService = new DateService();
        ZoneTimeService zoneTimeService = new ZoneTimeService();
        SecondsAManLived secondsAManLived = new SecondsAManLived();
        LeapYearService leapYearService = new LeapYearService();
        FileService fileService = new FileService();

        LocalDateTime birthDate = LocalDateTime.of(2020, 1, 1, 12, 12, 12);
        LocalDateTime deathDate = LocalDateTime.of(2020, 1, 2, 12, 12, 12);
        LocalDate republicDate = LocalDate.of(1950, 1, 26);
        String filePath = "./src/main/resources/sample.txt";

        System.out.println("***********1.1************\n");
        System.out.println(studentService.getStudentsWithNoSecondaryAddress(listOfStudents));
        System.out.println("\n************1.2***********\n");
        System.out.println(studentService.getStudentsWithInitialOfUserAndNoSecAddress(listOfStudents, "y"));
        System.out.println("\n************2**********\n");
        System.out.println(dateService.getListBirthDateDay(LocalDate.of(1996, 9, 20)));
        System.out.println("\n************3***********\n");
        System.out.println(zoneTimeService.getZonedTime("America/New_York"));
        System.out.println("\n*************4**********\n");
        System.out.println(secondsAManLived.getSecondsAManLived(birthDate, deathDate));
        System.out.println("\n*************5**********\n");
        System.out.println(leapYearService.getAllLeapYear(republicDate));
        System.out.println("\n*************6**********\n");
        System.out.println(fileService.getWordsOccurrences(filePath));
    }
}
