package ru.gb.java.leson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
//        2)Найти пересечение двух множеств
//        Пример:
//        set1= [1,2,3,4]
//        set2= [3,5,6,7]
//        Вывод в консоль:
//[3]
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> resultSet = new HashSet<>(firstSet);
        resultSet.retainAll(secondSet);
        System.out.println("firstSet = " + firstSet);
        System.out.println("secondSet = " + secondSet);
        System.out.println("resultSet = " + resultSet);
    }
}
