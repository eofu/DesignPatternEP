package com.myself.pattern4proxy.dynamicproxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {
    public static void main(String[] args) throws Exception {

        Person person = (Person) new Sf().getInstance(new Programmer());
        person.shopping();

        Person instance = (Person) new Eleme().getInstance(new Programmer());
        instance.dinner();

        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/yangshuai/Desktop/$Proxy0.class");
        fileOutputStream.write($Proxy0s);
        fileOutputStream.close();
    }
}
