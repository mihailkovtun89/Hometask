package com.company;

import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 10000; i++) {
            if (i % 5 == 0 & i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
