package com.myself.pattern4proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// 每一个动态代理对象都会关联一个InvocationHandler对象，当代理对象的任何方法被调用的时候，都会被转发到InvocationHandler对象的invoke()方法上去。Ò
public class Eleme implements InvocationHandler {
	private Person person;

	/**
	 * 动态代理的一般模式是会在代理对象上执行被代理的操作，然后使用Method.invoke()方法将请求转发给被代理对象处理，并传入必须的参数。这样看起来作用并不是很大，但实际使用的时候是可以对传入的参数进行处理的并且还可以根据Method中获取的信息来决定如何对方法进行转发，处理过程是可以非常灵活的。
	 *
	 * @param proxy  代理对象
	 * @param method 代理对象中需被代理的方法
	 * @param args   调用这个方法所传入的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理................");
		return method.invoke(person, args);
	}

	public Object getInstance(Person person) {
		this.person = person;
		Class<? extends Person> aClass = person.getClass();
		return Proxy.newProxyInstance(
				// 指定产生代理对象的类加载器
				aClass.getClassLoader(),
				// 指定目标对象的实现接口
				aClass.getInterfaces(),
				// 指定InvocationHandler对象
				this);
	}
}
