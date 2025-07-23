package com.alaw810.ex6;

import java.util.ArrayList;
import java.util.List;

public class MainEx6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("123456789", "Java", "ITAcademy", "Hello", "999", "Lambdas"));
        System.out.println("List before sorting: " + list);

        list.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("List after sorting: " + list);

    }
}
