package ru.gb.java.leson3.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "красный", "деревянный"),
                new Cube(3, "красный", "деревянный"),
                new Cube(3, "красный", "деревянный"),
                new Cube(2, "желтый", "деревянный")
        ));

        int kYellow = 0;
        int sumVolume = 0;
        int kWood = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("желтый")) {
                kYellow++;
                sumVolume += cube.getVolume();
            }
            if (cube.getMaterial().equals("деревянный")) {
                kWood++;
            }
        }
        System.out.println("kYellow = " + kYellow);
        System.out.println("sumVolume = " + sumVolume);
        System.out.println("kWood = " + kWood);
        System.out.println("cubeList = " + cubeList);
        unicCollection(cubeList);
        System.out.println("cubeList = " + cubeList);
    }

    private static void unicCollection(List<Cube> cubeList) {
        for (int i = 0; i < cubeList.size(); i++) {
            Cube currentCube = cubeList.get(i);
            for (int j = i + 1; j < cubeList.size(); j++) {
                if (currentCube.equals(cubeList.get(j))) {
                    cubeList.remove(j);
                    j--;
                }
            }
        }
    }
}