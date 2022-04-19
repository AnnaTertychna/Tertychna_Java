package com.andersenlab;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int num = in.nextInt();
            if (num > 7) {
                System.out.println("Привет");
            }
        }
    }
}
