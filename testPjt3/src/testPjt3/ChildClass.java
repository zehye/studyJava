package testPjt3;

public class ChildClass extends ParentClass {

	public ChildClass() {
		System.out.println(" -- ChildClass Concstructor -- ");
	}
	
	public void childFun() {
		System.out.println(" -- childFun() --"); 
	}
	
	@Override
	public void makeJajang() {
		System.out.println("--more--");
	}
}
