package testPjt;

// 증감연산자
public class ReeNewMainClass {
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println("x++ : " + (x++));
		System.out.println("x : " + x);
		
	}
}
// 전위연산자(++x)는 일단 연산하고 출력하고
// 후위연산자(x++)는 일단 값을 출력하고 메모리상으로 연산된 숫자가 들어가있다는 것 확인