package com.myself.pattern1factory.abstractFactory;

import com.myself.pattern1factory.simple.Furniture;

public abstract class AbstractFactory {
    abstract Furniture getChair();
    abstract Furniture getDesk();
    abstract Furniture getSofa();
}
