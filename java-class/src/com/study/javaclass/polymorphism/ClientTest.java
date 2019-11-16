package com.study.javaclass.polymorphism;

import com.study.javaclass.Car;
import com.study.javaclass.SedanCar;
import com.study.javaclass.interfaceDemo.DemoJava8Impl;

public class ClientTest {

	public static void main(String[] args) {

		Car car = new SedanCar();
		car.run();

		DemoJava8Impl demoJava8 = new DemoJava8Impl();
		demoJava8.doSomthing();
		demoJava8.anotherDefaultMehtod();
	}
}
