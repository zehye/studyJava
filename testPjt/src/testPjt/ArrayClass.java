package testPjt;

public class ArrayClass {

	public static void main(String[] args) {
		// 자료형[배열기호] 배열이름 = new키워드(연산자) 배열의 크기 
		// 배열을 선언했다는 것은 메모리에 배열의 크기만큼 메모리를 확보했다는 것을 의미 
		int[] arr1 = new int[5]; //배열 선언 단계 
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		int[] arr2 = {10,20,30};
		System.out.println(arr2[0]);
		
		
	}
}
