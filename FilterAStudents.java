package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAStudents {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Ajay", "Bhavana", "Anu", "Kiran", "Arun", "Ravi", "Amala", "Deepak", "Anjali", "Vijay");

        List<String> aStudents = students
                .stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students who get special gifts: " + aStudents);
    }
}
