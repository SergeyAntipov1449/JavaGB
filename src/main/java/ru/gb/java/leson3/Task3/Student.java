package ru.gb.java.leson3.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Integer groupNum;
    private Integer salary;
    private List<Integer> marks;

}
