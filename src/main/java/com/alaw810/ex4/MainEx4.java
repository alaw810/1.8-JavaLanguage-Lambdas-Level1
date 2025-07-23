package com.alaw810.ex4;

import java.util.List;

public class MainEx4 {
    public static void main(String[] args) {
        List<String> names = List.of("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        names.forEach(System.out::println);

    }
}