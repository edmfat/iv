package imp1;

import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		String[] names= {"Sunil","Ravi","Aman","Delhi","Anshuman","antra"};
		
          Predicate<String>p=name -> name.charAt(0)=='A';
          
          for (String name :names) {
        	  if(p.test(name)) {
        		  System.out.println(name);
        	  }
          }
		

	}

}
