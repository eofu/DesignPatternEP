package com.myself.pattern1factory;

import com.myself.pattern1factory.simple.Chair;
import com.myself.pattern1factory.simple.Furniture;

public class ChairFactory implements Factory{
    @Override
    public Furniture getfurniture() {
        return new Chair();
    }
}
