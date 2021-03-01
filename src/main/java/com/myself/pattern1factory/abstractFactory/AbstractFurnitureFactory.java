package com.myself.pattern1factory.abstractFactory;

import com.myself.pattern1factory.simple.Chair;
import com.myself.pattern1factory.simple.Desk;
import com.myself.pattern1factory.simple.Furniture;
import com.myself.pattern1factory.simple.Sofa;

public class AbstractFurnitureFactory extends AbstractFactory {
    @Override
    Furniture getChair() {
        return new Chair();
    }

    @Override
    Furniture getDesk() {
        return new Desk();
    }

    @Override
    Furniture getSofa() {
        return new Sofa();
    }
}
