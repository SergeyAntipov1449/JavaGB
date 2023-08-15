package ru.gb.java.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListAnalysis {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array.add(random.nextInt(-50, 50));
        }
        System.out.println("arrayInitial = " + array);

        listSort(array);
        System.out.println("arraySorted = " + array);

        int minNumber = getMinNum(array);
        System.out.println("minNumberInList = " + minNumber);

        int maxNumber = getMaxNum(array);
        System.out.println("maxNum = " + maxNumber);

        double avg = getAvg(array);
        System.out.println("avg = " + avg);

    }

    /**
     * @param array список целых чисел
     * @return
     * @apiNote Вычесление среднего арифметического
     */
    private static double getAvg(List<Integer> array) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        avg = (double) sum / array.size();
        return avg;
    }

    /**
     * @param array список целых числе
     * @return
     * @apiNote поиск максимального значения в списке
     */
    private static int getMaxNum(List<Integer> array) {
        int maxNum = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > maxNum) {
                maxNum = array.get(i);
            }
        }
        return maxNum;
    }

    /**
     * @param array список целых чисел
     * @return
     * @apiNote поиск минимального значения в списке
     */
    private static int getMinNum(List<Integer> array) {
        int minNum = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < minNum) {
                minNum = array.get(i);
            }
        }
        return minNum;
    }


    /**
     * @param array список целых чисел
     * @apiNote соритровка коллекции по возрастанию
     */
    private static void listSort(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                int temp = 0;
                if (array.get(j) > array.get(i)) {
                    temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    }

//    Сортирует его по возрастанию и выводит на экра
}
