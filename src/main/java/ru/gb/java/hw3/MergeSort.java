package ru.gb.java.hw3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int a[] = new int[]{9, 13, 25, 0, -21, -55, 34, 5, 1, 6, 2, 3, 4};
        int b [] = mergeSort(a);
        System.out.println(Arrays.toString(b));

    }
    private static int[] mergeSort(int[] a) {
        if (a.length <= 1) { // Если длина массива меньше или равна 1, то он уже отсортирован
            return a;
        }
        int mid = a.length / 2; // Находим середину массива
        int[] left = new int[mid]; // Создаем массив для левой половины
        int[] right = new int[a.length - mid]; // Создаем массив для правой половины
        System.arraycopy(a, 0, left, 0, left.length); // Копируем левую половину в отдельный массив
        System.arraycopy(a, mid, right, 0, right.length); // Копируем правую половину в отдельный массив
        left = mergeSort(left); // Рекурсивно сортируем левую половину
        right = mergeSort(right); // Рекурсивно сортируем правую половину
        return merge(left, right);
    }

    private static int[] merge(int [] left, int [] right) {
        int[] result = new int[left.length + right.length]; // Создаем массив для объединенных половин
        int i = 0, j = 0, k = 0; // Индексы для левой, правой и результирующей половин
        while (i < left.length && j < right.length) { // Пока не достигнут конец левой или правой половины
            if (left[i] <= right[j]) { // Если текущий элемент левой половины меньше или равен текущему элементу правой половины
                result[k++] = left[i++]; // Добавляем текущий элемент левой половины в результирующую половину
            } else {
                result[k++] = right[j++]; // Иначе добавляем текущий элемент правой половины в результирующую половину
            }
        }
        while (i < left.length) { // Если остались элементы в левой половине
            result[k++] = left[i++]; // Добавляем их в результирующую половину
        }
        while (j < right.length) { // Если остались элементы в правой половине
            result[k++] = right[j++]; // Добавляем их в результирующую половину
        }
        return result;
    }
}
