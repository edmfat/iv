package imp1;

import java.util.function.Predicate;

public class FindWhichCountryStartAtA {

	public static void main(String[] args) {
		
		//declare an array of CountryName
		String[] countryName = {"America","Newziland","Autraliya","Austin","India","Ghana","Singapur"};
		
		Predicate<String > p= counrty -> counrty.charAt(0)=='A';
		
		
		for(String country : countryName) {
			
			if(p.test(country)) {
				System.out.println(country);
			}
		}
	}

}
