package com;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(inputDate);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Your age is: " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");
    }
}
