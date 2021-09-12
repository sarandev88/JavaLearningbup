package polymorphism;

public class Coverride extends Moverride {
	//child class
	
	public void marriage() {
		System.out.println("MY LIFE MY RULES");

	}
	
	public static void main(String[] args) {
		Coverride m = new Coverride();
		m.property();
		m.marriage();
		
	
		
	}

}
