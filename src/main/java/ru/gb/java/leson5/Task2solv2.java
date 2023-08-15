package ru.gb.java.leson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2solv2 {
    public static void main(String[] args) {
        //2)Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
        //В противном случае (false).
        Map<Integer, Integer> dubMap = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2));

        for (int i = 0; i < a.size(); i++) {
            dubMap.putIfAbsent(a.get(i), 0);
            dubMap.put(a.get(i), dubMap.get(a.get(i)) + 1);
        }
        dubleArrayMessage(dubMap);
        System.out.println("dubMap = " + dubMap);
    }

    private static void dubleArrayMessage(Map<Integer, Integer> dubMap) {
        for (Map.Entry<Integer, Integer> elem : dubMap.entrySet()) {
            if (elem.getValue() > 1) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
