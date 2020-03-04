package com.knoldus.service;

import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FileService {
    public Map<String, Integer> getWordsOccurrences(String filePath) {
        Map<String, Integer> countOfWords = Collections.emptyMap();
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            Stream<String> words = lines.flatMap(line -> stream(line.split(" ")));
        } catch (IOException e) {
            System.out.println("File do not exist.");
        }
        return countOfWords;
    }

    Integer getCountOfWordInALine(String word, String line) {
        List<String> listOfWords = Arrays.asList(line.split(" "));
        long count = listOfWords.stream().filter(str -> str.equals(word)).count();
        return (Integer) (int) count;
    }
}
