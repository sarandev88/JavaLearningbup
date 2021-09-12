package constructors;

public class Consoverloa {
	
	
	//constructor overriding
	
	Consoverloa () {
		System.out.println("dummy");
	}

	Consoverloa(String a) {
		System.out.println("ans is:"+a);
	}
	
	Consoverloa (int a, float f){
		System.out.println("value and float is");
		
	}
public static void main(String[] args) {
	Consoverloa cl = new Consoverloa();
    Consoverloa cl1 = new Consoverloa("welcome");
    Consoverloa cl2 = new Consoverloa("50, 5.60f");
    		
}



}

