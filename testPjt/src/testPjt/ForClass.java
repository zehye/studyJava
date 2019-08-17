package testPjt;

import java.util.Scanner;

public class ForClass {
	public static void main(String[] args) {
//		for (int i = 1; i<10; i++) {
//		System.out.println(i);
//		}
		
		System.out.println("INPUT NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int inputnumber = scanner.nextInt();
		
		for (int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", inputnumber, i, (inputnumber*i));
		}
	}
}
