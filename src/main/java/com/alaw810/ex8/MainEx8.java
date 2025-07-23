package com.alaw810.ex8;

public class MainEx8 {
    public static void main(String[] args) {
        StringReverser reverser = (input) -> new StringBuilder(input).reverse().toString();

        String original = "Hello World!";
        String reversed = reverser.reverse(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
