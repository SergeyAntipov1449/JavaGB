package ru.gb.java.hw5;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));

        Map<String, Integer> nameCount = NameCountToMap(nameList);

        Map<Integer, List<String>> groupedNames = RevGroupedMap(nameCount);

        PrintMap(groupedNames);
    }

    /**
     * @param groupedNames
     * @apiNote вывод мапы форматированной стройкой
     */
    private static void PrintMap(Map<Integer, List<String>> groupedNames) {
        Iterator<Map.Entry<Integer, List<String>>> sample = groupedNames.entrySet().iterator();
        while (sample.hasNext()) {
            Map.Entry<Integer, List<String>> entry = sample.next();
            if (entry.getKey() != 1) {
                System.out.printf("В списке %d раз(а) встечается %s.\n", entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * @param nameCount
     * @return
     * @apiNote группировка значений под одним ключем
     */
    private static Map<Integer, List<String>> RevGroupedMap(Map<String, Integer> nameCount) {
        Map<Integer, List<String>> groupedNames = new TreeMap<>(Collections.reverseOrder());

        Iterator<Map.Entry<String, Integer>> itr = nameCount.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (!groupedNames.containsKey(entry.getValue())) {
                groupedNames.putIfAbsent(entry.getValue(), new ArrayList<String>());
            }
            groupedNames.get(entry.getValue()).add(entry.getKey());

        }
        return groupedNames;
    }

    /**
     * @param nameList
     * @return
     * @apiNote запись в мапу только имен из списка
     */
    private static Map<String, Integer> NameCountToMap(ArrayList<String> nameList) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (int i = 0; i < nameList.size(); i++) {
            nameCount.putIfAbsent(nameList.get(i).split(" ")[0], 0);
            nameCount.put(nameList.get(i).split(" ")[0], (nameCount.get(nameList.get(i).split(" ")[0]) + 1));
        }
        return nameCount;
    }
}
