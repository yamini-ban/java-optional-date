package com.knoldus.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYearService {
    public List<LocalDate> getAllLeapYear(LocalDate republicDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(republicDate, currentDate);
        int noOfYears = period.getYears();
        List<Integer> integerList = IntStream.range(0, noOfYears + 1).boxed().collect(Collectors.toList());
        return integerList.stream()
                .map(republicDate::plusYears)
                .filter(LocalDate::isLeapYear)
                .collect(Collectors.toList());
    }
}
