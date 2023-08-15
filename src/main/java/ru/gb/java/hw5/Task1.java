package ru.gb.java.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String income = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Map<String, Integer> wordCount = parseStringToHashMap(income);
        for (Map.Entry<String, Integer> sample : wordCount.entrySet()) {
            System.out.printf("Слово\u001B[1m %s\u001B[0m встерчается %d раз(а) \n", sample.getKey(), sample.getValue());
        }
    }

    /**
     * @param income входящая строка
     * @return
     * @apiNote запись строки по словам в HashMap
     */
    private static Map<String, Integer> parseStringToHashMap(String income) {
        String[] words = income.toLowerCase().split("\\PL+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordCount.putIfAbsent(words[i], 0);
            wordCount.put(words[i], wordCount.get(words[i]) + 1);
        }
        return wordCount;
    }
}
