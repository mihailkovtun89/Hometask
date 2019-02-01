package com.company;

import java.util.Scanner;

public class Main66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = 0, b1 = 0;
        for (int i = 0; i <= 10000; i++) {
            if (i > 999 && i < 10000) {
                a1 = i / 100;
                b1 = i % 100;
                int sum1 = 0;
                int sum2 = 0;
                while (a1 != 0) {
                    sum1 = sum1 + a1 % 10;
                    a1 = a1 / 10;
                }
                while (b1 != 0) {
                    sum2 = sum2 + b1 % 10;
                    b1 = b1 / 10;
                }
                if (sum1 == sum2) {
                    System.out.println(i);
                }

            }
            }
        }
}
