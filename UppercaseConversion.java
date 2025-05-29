package com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConversion {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        List<String> upperCaseNames = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
