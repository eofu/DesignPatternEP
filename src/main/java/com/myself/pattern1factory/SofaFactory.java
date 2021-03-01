package com.myself.pattern1factory;

import com.myself.pattern1factory.simple.Furniture;
import com.myself.pattern1factory.simple.Sofa;

public class SofaFactory implements Factory{
    @Override
    public Furniture getfurniture() {
        return new Sofa();
    }
}
