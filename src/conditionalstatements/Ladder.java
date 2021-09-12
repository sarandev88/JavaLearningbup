package conditionalstatements;

public class Ladder{
	public static void main(String[] args) {
		int i= 10; String s = "Vanilla";
		
		if(i<=5 && s== "Vanilla") {
			System.out.println("True");
		}
			else if (i<=10 && s== "vanilla") {
				System.out.println("Second passed");
			}
				else if (i<=10 && s == "Vanilla") {
					System.out.println("Great work");
			}
				else
					System.out.println("Failed");
		
				
			}
			
		
	
	
}

