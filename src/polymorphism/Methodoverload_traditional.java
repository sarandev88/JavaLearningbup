package polymorphism;

public class Methodoverload_traditional {
	
	public void add(int a) {
		System.out.println("employee details:"+a);
		

	}
	public void add(int a, String b) {
		System.out.println(a+" "+ b);
	}
	
public void add(int b, int c) {
	System.out.println(b+" "+c);
	
	

}
public static void main(String[] args) {
	
	Methodoverload_traditional M = new Methodoverload_traditional();
	
	M.add(50);
	M.add(100, 560);
	M.add(850, "saranya");
}
	
	

}
