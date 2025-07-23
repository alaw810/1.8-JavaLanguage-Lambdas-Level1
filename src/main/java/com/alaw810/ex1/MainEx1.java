package com.alaw810.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class MainEx1 {
    public static void main(String[] args) {
        List<String> names = List.of("Paul", "John", "Mark", "Monica", "Oscar", "Rachel");
        List<String> namesWithO = names.stream()
                .filter(name -> name.toLowerCase().contains("o"))
                .collect(Collectors.toList());

        System.out.println(namesWithO);

    }
}