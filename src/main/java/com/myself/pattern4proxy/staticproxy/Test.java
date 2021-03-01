package com.myself.pattern4proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        new YellowMoww().replaceBuyTicket(student);
    }
}
