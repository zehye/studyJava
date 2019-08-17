package testPjt;

import java.util.Scanner;

public class WhileClass {
	public static void main(String[] args) {
		System.out.println("INPUT NUMBER : ");
		
		Scanner scanner = new Scanner(System.in);
		int inputnumber = scanner.nextInt();
		
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", inputnumber, i, (inputnumber*i));
			i++;
		}
		
	}
}
