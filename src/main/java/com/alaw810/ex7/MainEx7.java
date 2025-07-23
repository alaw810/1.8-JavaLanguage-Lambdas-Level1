package com.alaw810.ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainEx7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("123456789", "Java", "ITAcademy", "Hello", "999", "Lambdas"));
        System.out.println("List before sorting: " + list);

        list.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("List after sorting: " + list);

    }
}
