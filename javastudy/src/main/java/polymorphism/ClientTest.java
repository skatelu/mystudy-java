package polymorphism;

import interfaceDemo.DemoJava8Impl;

public class ClientTest {

	public static void main(String[] args) {

//		Car car = new SedanCar();
//		car.run();

		DemoJava8Impl demoJava8 = new DemoJava8Impl();
		demoJava8.doSomthing();
		demoJava8.anotherDefaultMehtod();
	}
}
