package com.company;

import java.util.Scanner;

public class Main65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i > 99 && i < 1000) {
                a = i / 10 / 10;
                b = i / 10 % 10;
                c = i % 10 % 100;

                if (a != b && a != c && b != c && b != a &&  c != b && c != a ){

                    System.out.println(i);
                }
            }
        }

        }
}
