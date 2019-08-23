package whatMethod;

public class MainClass2 {

	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		
		obj1.getInfo();
		obj1 = null; //레퍼런스가 이제 끊긴다.   
		// obj1.getInfo(); 
		
		obj2.getInfo();
		
		
	}
}
