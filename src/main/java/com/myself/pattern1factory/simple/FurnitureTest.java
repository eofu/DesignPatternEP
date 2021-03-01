package com.myself.pattern1factory.simple;

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        System.out.println(furnitureFactory.getFurniture("chair"));
    }
}
