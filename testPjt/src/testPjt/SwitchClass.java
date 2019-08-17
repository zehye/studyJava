package testPjt;

import java.util.Scanner;

public class SwitchClass {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		// sysout으로 출력만 받는게 아니라 유저로부터 어떤 데이터 값을 받고싶을때는 Scanner라는 객체를 사용함 
		// 객체를 생성할때는 new라는 키워드를 이용함 
		
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score) { //key값은 비교할 대상의 값을 넣어줌 
		case 100:
		case 90:
			System.out.println("수");
			break;
		case 80:
			System.out.println("score is 80");
			break;
		case 70:
			System.out.println("score is 70");
			break;
		case 60:
			System.out.println("score is 60");
			break;
			
		default: //사용자가 입력한 값이 그 어느값도 아닐때(위에 설정한 값중에서) 실행해라.
			System.out.println("what score?");
			break;
		}
		
		inputNum.close();
	}
}
