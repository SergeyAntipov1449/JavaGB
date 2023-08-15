package ru.gb.java.leson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну последовательности");
        int n = scanner.nextInt();
        int res = getRes(scanner, n);
        System.out.println("res = " + res);
    }

    /**
     * @param scanner
     * @param n       длинна последовательности
     * @return сумма
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int getRes(Scanner scanner, int n) {
        int res = 0;
        System.out.println("Введите последовательность");
        int x = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int y = scanner.nextInt();
            if (y % 10 == 5 && x % 2 == 0) {
                res = res + y;
            }
            x = y;
        }
        return res;
    }
}