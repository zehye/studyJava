package com.java.toy;

public class ToyRobot implements Toy{

	@Override
	public void walk() {
		System.out.println("TR walk");
		
	}

	@Override
	public void run() {
		System.out.println("TR run");
		
	}

	@Override
	public void alarm() {
		System.out.println("TR alarm");
		
	}

	@Override
	public void light() {
		System.out.println("TR light");
		
	}

}
