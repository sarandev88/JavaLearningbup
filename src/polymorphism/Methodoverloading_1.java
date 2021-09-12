package polymorphism;

public class Methodoverloading_1 {
	// class will have same method name but different aruguments and parameters
	
	public void barclays(Hamlett coding) {
     System.out.println("Dataentry");
	}
	
	public void barclays(Firestone coding) {
    System.out.println("tough task");
	}
	
	public void barclays(DD Coding) {
    System.out.println("Easy task");
	}
	public static void main(String[] args) {
		
		Methodoverloading_1 m = new Methodoverloading_1();
		Hamlett h = new Hamlett();
		m.barclays(h);
		DD d = new DD();
		m.barclays(d);
		Firestone f = new Firestone();
		m.barclays(f);
		
		
	
	}

}

