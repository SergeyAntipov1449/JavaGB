package ru.gb.java.leson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>(Arrays.asList(6, 9, 3, 4, 8, 6, 1, 5, 2));
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 != 0) {
                sum += numList.get(i);
            }
        }
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i)%3 != 0 ){
                numList.set(i, sum);
            }
        }
        System.out.println("numList = " + numList);
    }
}
