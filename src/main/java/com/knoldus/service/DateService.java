package com.knoldus.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DateService {
    public List<String> getListBirthDateDay(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int years = period.getYears();
        List<Integer> integerList = IntStream.range(0, years + 1).boxed().collect(Collectors.toList());
        return integerList
                .stream()
                .map(i -> birthDate.plusYears(i).getDayOfWeek().toString())
                .collect(Collectors.toList());

    }
}
