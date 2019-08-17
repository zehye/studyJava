package oop1Pjt;

public class MainClass2 {
	
	public static void main(String[] args) {
		Bicycle mybicycle = new Bicycle();
		// new키워드를 통해 Bicycle의 생성자가 호출이 되는데
		// 위에 처럼 new bicycle()이라고해서 ()이 안에 아무 parameter를 넣지않고도 호출이 가능해
		// 가장 기본적인 생성자라고 해서 얘를 default생성자 라고함.
		
		// 근데 이 방법만이 있는게 아님.
		// 생성자는 꼭 하나만 있을 필요가 없음  (Bicycle.java로 이동)
		
		mybicycle.color = "red";
		mybicycle.price = 100;
		
		mybicycle.info();
		
		Bicycle mybicycle2 = new Bicycle("blue", 200);
		mybicycle2.info();
	}
}
