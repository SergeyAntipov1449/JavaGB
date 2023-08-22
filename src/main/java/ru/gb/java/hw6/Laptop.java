package ru.gb.java.hw6;

public class Laptop {
    private String model;
    private int ram;
    private int hdd;
    private double screenSize;
    private String os;
    private String colour;

    public Laptop(String model, int ram, int hdd, double screenSize, String os, String colour) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.screenSize = screenSize;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\nМодель\t" + model +
                "\nОперативная память\t" + ram +
                "\nЖесткий диск\t" + hdd +
                "\nЭкран\t" + screenSize +
                "\nОперационная система\t" + os +
                "\nЦвет\t" + colour +
                "\n==============================";
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }
}
