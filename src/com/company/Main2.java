package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = args.length - 1; i >=0 ; i--) {
            System.out.println(args[i]);
        }

    }
}
