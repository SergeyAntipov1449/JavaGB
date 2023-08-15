package ru.gb.java.hw6;

import java.util.HashSet;
import java.util.Set;

public class StoreSearch {
    public static void main(String[] args) {
        Set<Laptop> store = new HashSet<>();
        store.add(new Laptop("HP", 16, 1024, 15.6, "Windows","silver" ));
        store.add(new Laptop("HP", 16, 256, 16, "Windows","white" ));
        store.add(new Laptop("HP", 64, 512, 15.6, "Windows","black" ));
        store.add(new Laptop("Lenovo", 16, 512, 17.3, "Windows","black" ));
        store.add(new Laptop("Lenovo", 32, 1024, 17.3, "Windows","silver" ));
        store.add(new Laptop("MSI1", 16, 1024, 16, "Windows","white" ));
        store.add(new Laptop("MSI1", 8, 1024, 14, "Windows","silver" ));
        store.add(new Laptop("MSI3", 16, 1024, 15.6, "Windows","white" ));
        store.add(new Laptop("Asus1", 32, 256, 14, "Windows","black" ));
        store.add(new Laptop("Asus2", 32, 256, 15.6, "Windows","white" ));
        store.add(new Laptop("Asus3", 64, 256, 16, "Windows","black" ));
        store.add(new Laptop("Apple1", 32, 1024, 17.3, "Mac","silver" ));
        store.add(new Laptop("Apple2", 16, 512, 15.6, "Mac","black" ));
        store.add(new Laptop("Apple3", 16, 1024, 15.6, "Mac","black" ));
        store.add(new Laptop("Xiaomi1", 32, 512, 15.6, "Windows","white" ));
        store.add(new Laptop("Xiaomi2", 16, 512, 17.3, "Windows","black" ));
        System.out.println("store = " + store);

//        Laptop note1 = new Laptop("HP", 16, 1024, 15.6, "Windows","silver" );
//        Laptop note2 = new Laptop("HP", 16, 256, 16, "Windows","white" );
//        Laptop note3 = new Laptop("HP", 64, 512, 15.6, "Windows","silver" );
//        store.add(note1);
//        store.add(note2);
//        store.add(note3);
//        System.out.println("store = " + store);


    }
}
