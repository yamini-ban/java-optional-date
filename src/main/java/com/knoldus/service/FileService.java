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
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
//            lines.reduce(Collections.<String, Integer>emptyMap(), (acc, line) -> {
//                Stream<String> words = Arrays.stream(line.split(" "));
//                words.(Collections.<String, Integer>emptyMap(), (localWordCountInLine, word) -> {
//                    if(localWordCountInLine.c)
//                });
//            });
            Map<String, Integer> totalCount = Collections.emptyMap();

            lines.map(line -> {
                Stream<String> words = Arrays.stream(line.split(" "));
                Map<String, Integer> localCount = Collections.emptyMap();
                words.map(word -> {
                    if(totalCount.containsKey(word) && !(localCount.containsKey(word))) {
                        totalCount.put(word, totalCount.get(word) + getCountOfWordInALine(word, line));
                    }
                    else if(!(totalCount.containsKey(word)) && localCount.containsKey(word)) {
                        totalCount.put(word, getCountOfWordInALine(word, line));
                    }
                    else {

                    }
                });
            });
        }
        catch (IOException e) {
            System.out.println("File do not exist.");
        }

    }

    Integer getCountOfWordInALine(String word, String line) {
        List<String> listOfWords = Arrays.asList(line.split(" "));
        long count = listOfWords.stream().filter(str -> str.equals(word)).count();
        return (Integer)(int)count;
    }
}
