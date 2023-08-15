package ru.gb.java.hw3;

import java.util.ArrayList;
import java.util.Random;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array.add(random.nextInt( 100));
        }
        System.out.println("arrayInitial = " + array);


        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2 == 0){
                array.remove(i);
                i--;
            }
        }
        System.out.println("arrayFinal = " + array);
    }
}
