package ru.gb.java.leson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>(Arrays.asList(1, 9, 1, 456, 781, 67, 1, 5, 8));
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 0) {
                sum += numList.get(i);
            }
        }
        System.out.println("sum = " + sum);
    }
}
