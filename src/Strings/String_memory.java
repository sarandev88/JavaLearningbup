package Strings;

public class String_memory {
	
	public static void main(String[] args) {
		String s = "sairam";
		System.out.println(System.identityHashCode("r"));
		
		//duplicate kna will share the memory
		
		String a = "Hello";
		String b= "Hello";
		System.out.println(a);
		System.out.println(b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
	
//concate will create new memory
	
	String s = "saranya";
	String s1 = "Sairam";
	s2=s+s1;
			

}
