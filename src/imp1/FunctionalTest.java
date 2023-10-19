package imp1;

public class FunctionalTest {

	
	public  boolean test(int i) {
		if(i>10) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		FunctionalTest ft = new FunctionalTest();
		System.out.println(ft.test(15));
		
	}

}
