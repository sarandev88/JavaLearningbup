package stringsex;

public class Plitting {
	
	
	public static void main(String[] args) {
		
	
	String s = "Welcome To Java";
	String s1= "saranya";
	String[] split = s.split("e");
	for (String string : split) {
		System.out.println("splitted");
		System.out.println(string);
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));

		
	}
	}
}
