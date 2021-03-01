package com.myself.pattern4proxy.dynamicproxy.cglib;

public class CglibTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        PaoTui paoTui = new PaoTui();
        Customer instance = (Customer) paoTui.getInstance(Customer.class);
        instance.buy();
    }
}
