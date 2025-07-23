package com.alaw810.ex6;

import java.util.*;

public class MainEx6 {
    public static void main(String[] args) {
        List<Object> mixedList = List.of(
                "Java", 123, "ITAcademy", 3.14, "Hello", 9000, "Digital", "Cibernàrium"
        );

        List<String> stringsOnly = mixedList.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println("Sorted strings (shortest to longest):");
        stringsOnly.forEach(System.out::println);
    }
}
