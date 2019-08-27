package com.java.toy;

public class ToyAirplane implements Toy{

	@Override
	public void walk() {
		System.out.println("TA walk");
		
	}

	@Override
	public void run() {
		System.out.println("TA run");
		
	}

	@Override
	public void alarm() {
		System.out.println("TA alarm");
		
	}

	@Override
	public void light() {
		System.out.println("TA light");
		
	}

}
