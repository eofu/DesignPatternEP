package com.myself.pattern7delegate.leader;

public class TargetB implements ITarget {
    @Override
    public void doing(String commond) {
        System.out.println("B" + commond);
    }
}

