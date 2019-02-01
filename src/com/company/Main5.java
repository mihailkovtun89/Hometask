package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums [] = {2, 4, 8 };
        int sum = 1;
        for (int i : nums) {
            System.out.println("Value is :" + i);
            sum = sum * i;
        }
        System.out.println("Summation " + sum);
        }
    }

