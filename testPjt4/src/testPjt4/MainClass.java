package testPjt4;

public class MainClass {

	public static void main(String[] args) {
		Interface1 i1 = new InterfaceClass();
		Interface2 i2 = new InterfaceClass();
		
		i1.funA();
		// i1의 데이터타입은 Interface1이기때문에 접근은 funA에만 접근이 가능하다.
		i2.funB();
	}
}
