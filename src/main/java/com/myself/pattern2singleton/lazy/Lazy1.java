package com.myself.pattern2singleton.lazy;

public class Lazy1 {
    private static Lazy1 lazy1 = null;

    private Lazy1() {

    }

    private static Lazy1 getInstance() {
        if (lazy1 == null) {
            lazy1 = new Lazy1();
        }
        return lazy1;
    }

}
