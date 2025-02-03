package org.example;

import org.example.Models.Animal;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Animal animal = new Animal();
        animal.setAnimalId(123);
        System.out.println(animal.getAnimalId());
    }
}