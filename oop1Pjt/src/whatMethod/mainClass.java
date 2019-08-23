package whatMethod;

public class mainClass {
	public static void main(String[] args) {
		
		childClass child1 = new childClass();
		
//		child1.name = "박지혜";
//		child1.gender = "여자";
//		child1.age = 26;
		
		child1.setInfo("박지혜","여자", 26);
		child1.getInfo();
		}
}
