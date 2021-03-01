package com.myself.pattern1factory.abstractFactory;

public class AbstractFurnitureTest {
    public static void main(String[] args) {
        AbstractFurnitureFactory abstractFurnitureFactory = new AbstractFurnitureFactory();
        System.out.println(abstractFurnitureFactory.getChair());
    }
}
