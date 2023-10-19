package imp1;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		Address address = new Address("101","collectorate","ftp");
		Address address1 = new Address("102","DDU","hydrabad");
		Address address2 = new Address("103","chan","channai");
		Address address3 = new Address("104","collectorate","ftp");
		Address address4 = new Address("105","collectorate","bangluru");
		Address address5 = new Address("106","collectorate","prayagraj");
		Address address6 = new Address("107","rajatalab","varanasi");
		Address address7 = new Address("108","rajatalab","varanasi");
		Address address8 = new Address("109","rajatalab","varanasi");
		
		List<Address> adrList=new ArrayList<Address>();
		adrList.add(address);
		adrList.add(address1);
		adrList.add(address2);
		adrList.add(address3);
		adrList.add(address4);
		adrList.add(address5);
		adrList.add(address6);
		adrList.add(address7);
		adrList.add(address8);
		System.out.println("Adress List is:"+adrList);
		
		
		
		
		
		
		


	}

}
