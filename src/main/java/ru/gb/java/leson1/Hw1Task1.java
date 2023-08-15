package ru.gb.java.leson1;

import java.util.Scanner;

public class Hw1Task1 {
    public static void main(String[] args) {
        Integer n = getInteger();
        if (n == null) return;

        int sum = triangularNum(n);
        System.out.println(triangularNum(n));

    }

    /**
     * @apiNote расчет треугольного числа
     * @param n количество первых натуральных чисел
     * @return
     */
    private static int triangularNum(Integer n) {
        int k = 0;
        int sum = 0;
        while (k <= n){
            sum = sum + k;
            k++;
        }
        return sum;
    }

    /**
     * @apiNote ввод натурального числа из терминала
     * @return
     */
    private static Integer getInteger() {
        System.out.println("Введите натуральное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 0){
            System.out.println("Введенное число не является натуральным");
            return null;
        }
        return n;
    }
}
