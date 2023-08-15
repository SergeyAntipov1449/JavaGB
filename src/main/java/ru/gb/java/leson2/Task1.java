package ru.gb.java.leson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        int n = scan.nextInt();
        double res = pow(x, n);
        System.out.println("res = " + res);
    }

    /**
     * @apiNote возведение в степень. Условия: Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     * @param x основание
     * @param n степень
     * @return x ^ n
     */
    private static double pow(double x, int n) {
        double res = 1;
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;
    }

}
