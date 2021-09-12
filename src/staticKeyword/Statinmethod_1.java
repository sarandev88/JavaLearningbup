package staticKeyword;

public class Statinmethod_1 {
	//static keyword in method 
	
	//static  keyword  method can call without object
	public static void icecream() {
     System.out.println("Vanilla Icecream");
	}
	
	//without static  keyword we cannot call directly (nonstatic method)
	public  void Juice() {
    System.out.println("Milkshake");
	}
	
	
	public static void main(String[] args) {
	 icecream();
	 
	}

}
