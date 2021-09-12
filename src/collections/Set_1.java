package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_1 {
	public static void main(String[] args) {
		
		//hash set linked hash set tree set
		
		Set<Integer> s = new TreeSet<Integer>();
		s.add(50);
		s.add(60);
		s.add(100);
		s.add(520);
		System.out.println("numbers are:"+s);
		
		Set<String> s1 = new TreeSet<String>();
		s1.add("sairam");
		s1.add("Week");
		s1.add("hru");
		System.out.println("added one is:"+s1);
		
		
	}

}
