package Strings;

public class Stypes {
	public static void main(String[] args) {
		//length of string
		 
		String s ="    SARANYA and MAHADEVAN    ";
		int number=5;
		
		//length()
		int lent = s.length();
		System.out.println("length of string is:"+ lent);
		
		//equals
		
		boolean equi = s.equals("Saranya  Mahadevan");
		System.out.println("does it equals my string:"+equi);
		
		//equalsignore
		
		boolean equiign = s.equalsIgnoreCase("saranya mahadevan");
		System.out.println("does it ignore my equals:"+equiign);
		
		//startswith
		
		boolean sw = s.startsWith("SA");
		System.out.println("does it starts with:"+sw);
		
		//endswith
		
		boolean ew = s.endsWith("AN");
		System.out.println("does it endswith:"+ew);
		
		
		//to uppercase
		
		String uc = s.toUpperCase();
		System.out.println("change to uppercase:"+uc);
		
		//to lowercase
		String lc = s.toLowerCase();
		System.out.println("change to Lowecase:"+lc);
		
		
		//contains
		
	 boolean conti = s.contains("S");
	 System.out.println("does it contains:"+conti);
	 
	 //replace
	 String rpl = s.replace("and", "M");
	 System.out.println("replaced string is:"+rpl);
	 
	 //indexof
	 
	 int ind = s.indexOf("a");
	 System.out.println("index of:" +ind);
	 
	 int lastind = s.lastIndexOf("n");
	 System.out.println("last index is:"+lastind);
	 
	 //isempty
	 
	 boolean emp = s.isEmpty();
	 System.out.println("is this empty or not:" +emp);
	 
	 // substring   it crops the value
	 
	 String sub = s.substring(2);
	 System.out.println("cropped string is:"+sub);
	 
	 //substring at the beg and end
	 String begend = s.substring(2, 8);
	 System.out.println("cropped beg and end is:"+begend);
		
	 //concat
	 
	 String cc = s.concat("sairam");
	 System.out.println("the concated stirng is  :"  + cc);
	 
	 //trim--> removes the space at beginning and end
	 
	 String tr = s.trim();
	 System.out.println("the trimmed string is:"+tr);
	 
	 //valueof
	 String valof = s.valueOf(number);
	 System.out.println("the printed value is:"+valof);
		 
	 
	//joinof 
	 
	 String jn = s.join("&", "saranya", "mahadevan");
	 System.out.println("the joined string is:"+jn);
	 String jn1 = s.join("/", "30", "02", "1988");
	 System.out.println("the joined things are:" +jn1);
	 
	 //split
	 
	 String[] spl = s.split(" ");
	 for (String s1 : spl) {
		 System.out.println(s1);
		
	}
	
	 
	 
	}
	

}
