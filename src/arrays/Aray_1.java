package arrays;

public class Aray_1 {
	public static void main(String[] args) {
		//datatype varname [] = new datatype[];
		
		int i [] = new int [6];
//		i[0]=50;
//		i[1]=60;
//		i[2]=70;
//		i[3]=80;
//		i[5]=85;
		
		//duplicate values wont allow it will override
		
		i[0]=50;
		i[2]=56;
		i[2]=100;
		i[2]=95;
		i[3]=58;
		
		
		System.out.println(i[2]);
		
	}

}
