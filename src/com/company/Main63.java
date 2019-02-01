package com.company;

import java.util.Scanner;

public class Main63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <=10000 ; i++) {
            if (i % 3 == 0 || i % 9 == 0) {
                System.out.println(i);
            }

        }
    }
}
