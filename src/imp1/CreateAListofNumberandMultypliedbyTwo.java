package imp1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CreateAListofNumberandMultypliedbyTwo {

	public static void main(String[] args) {
		
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		for(int i =1;i<=10;i++) {
			Predicate<Integer> p =n-> n<=10;
			for(Integer nm :number) {
				System.out.println(p.test(nm));
			}
			number.stream().map(num ->num*2).forEach(System.out::println);
		}
		
		
	}

}
