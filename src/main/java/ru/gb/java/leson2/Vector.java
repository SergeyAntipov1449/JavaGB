package ru.gb.java.leson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     * @return длина вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector2 второй вектор
     * @return скалярное произведение
     */
    public double scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @param vector2 второй вектор
     * @return векторное произведение
     */
    public Vector proizv(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }

    /**
     * @param vector2 второй вектор
     * @return косинус
     */
    public double cos(Vector vector2) {
        return (scalar(vector2)) / (length() * vector2.length());
    }

    /**
     *
     * @param vector2 второй вектор
     * @return суммув векторв
     */
    public Vector sum(Vector vector2) {
        return new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z);
    }

    public Vector diff(Vector vector2) {
        return new Vector(
                x - vector2.x,
                y - vector2.y,
                z - vector2.z);
    }
}