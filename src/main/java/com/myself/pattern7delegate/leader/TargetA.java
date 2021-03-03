package com.myself.pattern7delegate.leader;

public class TargetA implements ITarget {
    @Override
    public void doing(String commond) {
        System.out.println("A" + commond);
    }
}
