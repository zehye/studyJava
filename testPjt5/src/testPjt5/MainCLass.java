package testPjt5;

public class MainCLass {

	public static void main(String[] args) {
		int i =10;
		int j = 0;
		int r = 0;
		
		System.out.println("-- Exception BEFORE --");
		
		try {
			r = i/j; 
		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("msg:" +msg);
		}
		
		System.out.println("-- Exception AFTER --");
	}
}
