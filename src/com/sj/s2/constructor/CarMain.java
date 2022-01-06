package com.sj.s2.constructor;


public class CarMain {

	public static void main(String[] args) {
		//변수 선언
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car("k3");
		Car car4 = new Car("k3", "brown");
		Car car5 = new Car("k5", "yellow", 2000);
		car2.brand = "k5";
		car.info();
		car1.info();
		car2.info();
		car3.info();
		car4.info();
		car5.info();

	}

}
