package ru.gb.java.leson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //2)Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
        //В противном случае (false).
        Map<Integer, Integer> dubMap = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(7);

        for (int i = 0; i < a.size(); i++) {
            dubMap.put(a.get(i), 1);

        }
        if (dubMap.size() < a.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("dubMap = " + dubMap);
    }
}
