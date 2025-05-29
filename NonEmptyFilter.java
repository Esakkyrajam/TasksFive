package com;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyFilter {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = listStrings
                .stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Non-Empty Strings: " + nonEmptyStrings);
    }
}
