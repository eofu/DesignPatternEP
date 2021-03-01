package com.myself.pattern4proxy.dynamicproxy.jdk;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Eleme implements InvocationHandler {
    private Person person;

    public Object getInstance(Person person) {
        this.person = person;
        Class<? extends Person> aClass = person.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("饿了么接单");
        method.invoke(this.person, args);
        System.out.println("顾客评价");
        return null;
    }
}
