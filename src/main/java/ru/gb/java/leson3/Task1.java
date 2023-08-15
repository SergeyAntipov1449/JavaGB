package ru.gb.java.leson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // рассчитать среднее арифметическое чисел
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        int sum = 0;
        int k = 0;
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
                k++;
            }
            Integer average = sum / k;
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println(average);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(" File not found ");
        }
    }
}
