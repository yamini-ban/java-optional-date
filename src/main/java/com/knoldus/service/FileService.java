package com.knoldus.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FileService {
    public Map<String, Integer> getWordsOccurrences(String filePath) {
        Map<String, Integer> countOfWords = new HashMap<>();
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.forEach(line -> stream(line.split(" ")).forEach(word -> {
                if (countOfWords.containsKey(word)) {
                    int newValue = countOfWords.get(word);
                    countOfWords.put(word, newValue + 1);
                } else {
                    countOfWords.put(word, 1);
                }
            }));

        } catch (IOException e) {
            System.out.println("File do not exist.");
        }
        return countOfWords;
    }
}
