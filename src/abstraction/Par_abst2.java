package abstraction;

public class Par_abst2 extends Partial_abst {
	@Override
	public void personalloan() {
System.out.println("personal loan is 80%");		
	}

	public static void main(String[] args) {
		Par_abst2 pa = new Par_abst2();
		pa.personalloan();
		pa.goldloan();
		pa.homeloan();
	}
}
