package ru.gb.java.leson2;

public class Task4 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        Vector vector2 = new Vector(3, 1, 2);
        System.out.println("vector = " + vector);
        System.out.println("vector.length() = " + vector.length());
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.proizv(vector2) = " + vector.proizv(vector2));
        System.out.println("vector.cos(vector2) = " + vector.cos(vector2));
        System.out.println("vector.sum(vector2) = " + vector.sum(vector2));
        System.out.println("vector.diff(vector2) = " + vector.diff(vector2));
    }

}
