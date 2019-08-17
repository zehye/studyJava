package oop1Pjt;


// 만약 내가 Graneur라는 객체를 만든다고 할때,
// public class Grandeur 라고 해서 클래스를 만들어주는 거니까
// class라는 키워드를 이용함

// 앞의 public은 접근제한자라고 하는데
// 바깥쪽에서 이 Grandeur를 다 사용할 수 있다고 하는것을 의미 (나중에 다시설명)

public class Grandeur { //클래스 이름: 첫글자는 대문자로 
	// class 키워드를 이용해서 어떤 클래스를 만들겠다고 선언을하고
	// 그 안에 속성들을 만들어주는데 (그 안의 구성요소들을 만들어줌)
	// 구성요소: 멤버변수(속성),메서드(기능), 생성자 
	

	public String color; // 멤버변수(속성)
	public String gear; // 속성은 변수 만들듯이 자료형을 써주고 속성의 이름을 써주고 
	public int price;
	
	public Grandeur() { //생성자 
		// 이 클래스로부터 객체가 만들어질때, 가장먼저 호출되는곳
		// 그 생성자는 클래스의 이름과 동일하게 만들어주고 
		// 생성을 할때 필요한 내용이 있다면 아래에 만들어주고
		// 없을 경우 그냥 비어놓아도 된다. 
		System.out.println("Grandeur constructor");
	}
	
	public void run() { // 메서드(기능)
		// 클래스로부터 뽑아져 나온 객체가 하는 일을 만들어주는 게 메서드인데,
		// 이 메서드의 형태는 접근제한자(public), 
		// 이 메서드를 호출한 곳에 어떤 데이터를 반환을 해줄때
		// 그 데이터의 자료형을 어떤 것을 해줄지를 써주는데
		// 반환하는 값이 없다 그럴때 void를 사용
		// 그리고 메서드의 이름 (run)
		
		// 그리고 run이라는 메서드를 호출했을 때, 
		// 수행/실행해야하는 기능을 기술하면 됨.
		System.out.println("-- run --");
		// run이라는 메서드가 수행할 수 있는 일을 기입
		// void가 아닌 string이라고 한다면
		// return이라는 키워드를 통해 "string"을 반환해줄 수 있다. 
		// 더이상 반환할 게 없을 경우 void라는 키워드를 사용 
	}
	
	public void stop() {
		System.out.println("-- stop --");
	}
	
	public void info() {
		System.out.println("-- info --");
		System.out.println(" color: " +color);
		System.out.println(" gear: " +gear);
		System.out.println(" price: " +price);
		
	}
}
