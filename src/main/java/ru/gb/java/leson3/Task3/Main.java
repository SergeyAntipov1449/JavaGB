package ru.gb.java.leson3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    2.Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по
//    3 предметам.
//    Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.

    public static void main(String[] args) {
        Student st1 = new Student("Петрова", 2, 3200, List.of(2,4,4));
        Student st2 = new Student("Петров", 2, 2100, List.of(2,2,4));
        Student st3 = new Student("Иванова", 3, 3200, List.of(4,4,4));
        Student st4 = new Student("Фролова", 5, 3200, List.of(2,4,4));
        Student st5 = new Student("Сидоров", 7, 3200, List.of(3,4,4));
        Student st6 = new Student("Васичкин", 4, 3200, List.of(3,4,4));
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);

        for (Student student : studentList) {
            if (student.getName().endsWith("ова") && markEve(student.getMarks())){
                System.out.println("student.getSalary() = " + student.getSalary());
            }
            
        }
    }

    private static boolean markEve(List<Integer> marks) {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum%2 == 0;
    }
}
