package com.alaw810.ex3;

import java.util.List;

public class MainEx3 {
    public static void main(String[] args) {
        List<String> names = List.of("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        names.forEach(name -> System.out.println(name));

    }
}