package com.myself.pattern4proxy.staticproxy;

public class YellowMoww {

    public void replaceBuyTicket(Person person) {
        person.buyTicket();
        System.out.println("kill any person");
    }
}
