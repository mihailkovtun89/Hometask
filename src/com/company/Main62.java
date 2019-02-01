package com.company;

import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            for (int i = 0; i <= 10000 ; i++) {
            if (i < 1) {
                System.out.println("min " + i);
            }
            else if (i > 9999) {
                System.out.println("max " + i);
            }
            }
        }
    }


