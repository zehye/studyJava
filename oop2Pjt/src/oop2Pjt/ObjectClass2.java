package oop2Pjt;

public class ObjectClass2 { 
	
	// 전역변수 : 객체가 생성되고 소멸될떄까지 메모리에 항상 존재하는 데이터, 변수 
	public int x; //3
	public int y;
	
	public ObjectClass2(String s, int[] iArr) {
		System.out.println(s);
		System.out.println(iArr);
	}
	
	public ObjectClass2(int x, int y) { //1 
		// 지역변수: 잠깐 활용되고 메모리에서 사라지는 애
		// 잠깐 일을 하는 경우는 생성이 될때 호출부에서 매개변수(10,20)을 던지는데
		// 그 10,20을잠깐 담고있다가 메모리에서 사라지고 
		
//		x = x;
//		y = y; //전역변수 = 지역변수;
		
		this.x = x;
		this.y = y;
		// this는 지금 내가 작업하고 있는 해당 객체를 가리킴
		// 즉 ObjectClass2에서 만들어지는 해당 객체를 가리키는 것 =>나 자신의 객체
		// 이 객체전체에 속해있는 객체중 x = 생성자로 전달된 파라미터 x
	}
	
	public void getInfo() {
		System.out.println(x);
		System.out.println(y);
	}
}
