package imp1.string;

public class Stringtest1 {

	
	
	public void reverse(String s) {
		String d="";
		for(int i=s.length()-1;i>=0;i--) {
			char t =s.charAt(i);
			d+=t;
			//System.out.print(t);
			System.out.print(d.toUpperCase());
		}
	
	}
	
	public String reverse1(String s) {
		
		String d="";
		char[] c=d.toCharArray();
		String[] t=s.split("");
		for(String p:t) {
			d=d+p;
		}
		System.out.println(d);
		return d;
	}
	
	public static void main(String[] args) {
		String s="Rahul";
		Stringtest1 str =new Stringtest1();
		str.reverse(s);
		
	}

}
