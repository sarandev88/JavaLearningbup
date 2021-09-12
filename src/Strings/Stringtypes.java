package Strings;

public class Stringtypes {
 public static void main(String[] args) {
	String s = "   Welcome To Java   ";
	System.out.println(s);
	
	
	//length
	int as = s.length();
	System.out.println(as);
	
	
	//equals -->  use is casing should match 
	boolean equals = s.equals("welcome to java");
    System.out.println(equals);
    
    //equalsignorecase--->   it ignores casing
    boolean Case = s.equalsIgnoreCase("welcome to java");
    System.out.println(Case);
    
    //to uppercase --> changes entire casing
    
    String uc = s.toUpperCase();
    System.out.println(uc);
    
    //to lowercase --> changes casing
    
    String lc = s.toLowerCase();
    System.out.println(lc);
    
    //startswith--->   checks whether it starts with the given char
     
    boolean startt = s.startsWith("Wel");
    System.out.println(startt);
    
    //endswith--->>>  checks whether it ends with the given char
    
    boolean ends = s.endsWith("sa");
    System.out.println(ends);
    
    //contains ---> check whether it has or not
    
     boolean cont = s.contains("Java");
    System.out.println(cont);
    
    // indexof---> first one
    
    int indof = s.indexOf("o");
    System.out.println(indof);
    
    
    //lastindexof--->
    
    int last = s.lastIndexOf("v");
    System.out.println(last);
    
    // replace-->  to replace the text into new one
    
    String rp = s.replace("To", "In");
    System.out.println(rp);
    
    // charat--> find one char 
    
     char char1 = s.charAt(8);
     System.out.println(char1);
     
     
     // substring (beginning)  reduces the first mentioned 
     
    String begs = s.substring(4);
    System.out.println(begs);
    
    //substring(beginning and end)   reduces beginning and end 
    
    String lastsub = s.substring(3, 12);
    System.out.println(lastsub);
    
    //trim --> it trim the spaces before & after " " only  & it wont take space in between the words
    
    
    String trim = s.trim();
    System.out.println(trim);
 }
 
    
    //  isempty--->> check whether   empty or not

    
   
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
}
 

