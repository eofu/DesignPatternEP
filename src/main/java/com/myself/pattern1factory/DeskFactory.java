package com.myself.pattern1factory;

import com.myself.pattern1factory.simple.Desk;
import com.myself.pattern1factory.simple.Furniture;

public class DeskFactory implements Factory{
    @Override
    public Furniture getfurniture() {
        return new Desk();
    }
}
