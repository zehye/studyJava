package testPjt;

public class IfClass {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if (num1<num2) {
			System.out.println("num1은 num2보다 작습니다.");
		}
		
		System.out.println();
		
		
		if (num1>num2) {
			System.out.println("num1은 num2보다 큽니다.");
		} else {
			System.out.println("num1은 num2보다 작습니다.");
		}
		
		System.out.println();
		
		if (num1==num2) {
			System.out.println("같다.");
		} else if (num1 > num2) {
			System.out.println("크다.");
		} else {
			System.out.println("작다.");
		}
	}
}
