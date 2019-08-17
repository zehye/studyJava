package oop1Pjt;

public class mainClass {
	// JVM이 프로그램을 실행할때 가장먼저 접근하는 곳이 main method
	// 따라서 main method를 가지고있는 클래스를 만들어준다. 
	
	
	public static void main(String[] args) {
		//여기서 Grandeur라는 클래스로부터 객체를 만들어본다.
		
		Grandeur myCar1 = new Grandeur();
		// 클래스로부터 객체를 생성하는 방법은 new라는 키워드를 사용한다. 
		// Grandeur 객체이름(닉네임) = new 클래스
		// ( Grandeur라는 클래스로부터  Grandeur라는 객체가 뽑아져나와 메모리에 탑재 )
		// new를 하자마자  Grandeur의 생성자가 호출되는 것 (메모리에 업로드)
		
		// new Grandeur() 얘로부터 메모리에 올라간 객체는 
		// 그것이 가리키고 있는 인스턴스/레퍼런스가 바로 myCar1 
		
		myCar1.color = "red";
		// 그래서 myCar1.(접근자)를 통해서 접근을 할수가 있음 
		//.접근자를 이용해 color, gear 등 속성에 접근을 할수가 있음
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		// 따라서 내가 지금 만든 객체의 색, 기어, 가격을 정해줄수 있음
		
		
		myCar1.run();
		// myCar1라는 객체의 기능을 가져옴 
		myCar1.stop();
		myCar1.info();
		
		System.out.println();
		
		Bicycle myCar2 = new Bicycle();
		
		myCar2.color = "blue";
		myCar2.price = 150000;
		
		myCar2.info();
	}
	
	// 메모리상에 객체를 만들어놓는것 (Grandeur)
	// 객체를 만들어 놓고 이 객체가 있는 곳을 가리키는 주소(레퍼런스) -myCar1
	// myCar1에는 객체를 가리키는 주소만 가지고있고 실제는 빈껍데기
	// 진짜 객체는 Grandeur가 가지고 있음 (메모리 어딘가에 있음)
	
	// 만약 쓰다가 그 관계를 끊어내면 
	// Grandeur라는 객체는 더이상 쓰여지지 않는것이고
	// 그떄 GC가 나타나 얘를 회수해감 (메모리 관리)
	
	
}
