package ru.gb.java.leson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] * 2) {
                k++;
            }
        }
        System.out.println("k = " + k);
    }
}
