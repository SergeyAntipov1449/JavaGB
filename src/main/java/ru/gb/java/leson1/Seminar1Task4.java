package ru.gb.java.leson1;

import java.util.Scanner;

public class Seminar1Task4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];
            addElementToArray(scanner, n, array);
            System.out.println(zadanieThree(array));
            viewElementArray(array);
        }

        /**
         * @param array входной массив
         * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
         */
        private static String zadanieThree(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - 1 - i]) {
                    return "не симметричный";
                }
            }
            return "симметричный";
        }

        /**
         * @param array наш массив
         * @apiNote выводим элементы массива
         */
        private static void viewElementArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("array[%d]= %d \n", i, array[i]);
            }
        }

        /**
         * @param scanner вспомогательный класс для ввода с кл-ы
         * @param n       количество элементов
         * @param array   наш массив
         * @apiNote вводим элементы массива
         */
        private static void addElementToArray(Scanner scanner, int n, int[] array) {
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }
    }
