package oop1Pjt;

public class Bicycle {
	
	
	public String color;
	public int price;
	
	public Bicycle() {
		System.out.println(" Bicycle Constructor ");
	}
	
	public Bicycle(String c, int p) {
		// 객체가 생성될때 객체가 생성되는 곳에서 값을 받는다. -> c&p
		System.out.println(" Bicycle Constructor 2 ");
		
		this.color = c;
		// 내가 갖고 있는 객체를 가리킨다고 해서 this라는 키워드 사용 
		// this의 컬러 (지금 이 객체의 컬러)에 c를 대입 
		// c는 이 객체를 생성해줄때 생성자를 호출해주는 곳에서 값을 던져주는 것 
		this.price = p;
		// p도 이 클래스를 호출해서 객체를 만들어주는 곳에서 값을 주는것 
		// MainClass2 로 다시 이동
	}
	
	
	public void info() {
		System.out.println(" -- info -- ");
		System.out.println(" color:  " + color);
		System.out.println(" print:  " + price);
	}
}
