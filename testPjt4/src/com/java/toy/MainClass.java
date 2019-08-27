package com.java.toy;

public class MainClass {

	public static void main(String[] args) {
		Toy ta = new ToyAirplane();
		Toy tr = new ToyRobot();
		
		Toy toys[] = {ta, tr};
		
		for (int i = 0; i<toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
		}
	}
}

/*
 * 각각의 객체에 구현한 기능들이 실제로 정확하게구현됨
 * 인터페이스를 이용하면 객체가 확장될 수가 있다 - 객체의 데이터 타입이 다형성으로 다양한
 * 객체의 타입을 가질수 있으며
 * 인터페이스에서 선언만 해주고 실제 구현은 인터페이스를 구현한 객체에서 하기 때문에
 * 내가 그떄그때 수시로 처음부터 객체를 새로 만드는것이 아니라
 * 인터페이스에서 제공해주는 메서드에 따라서 객체를 객체의 성격에 맞게 개성있게
 * 기능을 구현할 수 잇는 장점이 있다.
 */
