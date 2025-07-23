package com.alaw810.ex5;

public class MainEx5 {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;
        System.out.println("The value of pi is: " + pi.getPiValue());
    }
}
