package imp1.string;

public class StringTest {

	public static void main(String[] args) {

			
		String s="india";//this is the way of creating Object for Literal so that is called literal object which is stored in String Constant pool area.
		String s2="india";
		if(s==s2) {
			System.out.println("creatin one  Object and storing into the String Constant pool area");
		}else {
			System.out.println("this is not litteral");
		}
		
		
		//this is the 2nd way of creating object with the help of new  keyword in this case two object is created.First object is storing into the Heap Area and Another Object  is stored in String Constant Pool Area.
			
			String s1 = new String ("india");
			
			if(s1==s2.intern()) {
				System.out.println("creatin one  Object and storing into the String Constant pool area");
			}
			else {
				System.out.println("two object created");
			}
					
			
			
			String city1="nis";
			String city2="nis";
			
		if(city1==city2) {
			System.out.println("one boject is crreate dinto scp");
		}else {
			System.out.println("wrong");
		}
			
					
	}

}
