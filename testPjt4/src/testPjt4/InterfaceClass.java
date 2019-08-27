package testPjt4;

public class InterfaceClass implements Interface1,Interface2 {

	// 상속과는다르게 다형성, 여러개를 구현할 수 있다. 
	
	public InterfaceClass() {
		System.out.println(" InterfaceClass constructor ");
	}
	
	@Override
	public void funA() {
		System.out.println(" funA() ");
		
	}

	@Override
	public void funB() {
		System.out.println(" funB() ");
	}
	
}
