package collections;

import java.util.ArrayList;
import java.util.List;

public class New_Collec {
	
	public static void main(String [] args) {
		
		//methods
//		 add()  
//		Size()
//		  get()
//		 contains()
//		  remove()
//		  clear()
//		  indexof()
//		  set()
//		  addAll()
//		  RemoveAll()
//		  retainAll()
	
		//List<String>li = new ArrayList<String>();
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(50);
		li.add(70);
		li.add(80);
		li.add(100);
		System.out.println(li);
		int sz = li.size();
		System.out.println("Size of the list is:" +sz);
		
		Integer in = li.get(1);
		System.out.println("getetd value is:"+in);
		
		 boolean con = li.contains(100);
		 System.out.println("Does it contains or not:"+con);
		 
		 li.remove(2);
		 System.out.println("removed one is"+li);
		 
		 int io = li.indexOf(100);
		 System.out.println("indexed value is:"+io);
		 
		 Integer sete = li.set(1, 500);
		 System.out.println("set value is:"+sete);
		 
		li.add(50);
		li.add(100);
		li.add(600);
		
		List<Integer> li1 = new ArrayList<Integer>();
				li1.add(500);
				li1.add(600);
				li1.add(850);
				
				boolean adal = li.addAll(li1);
				System.out.println(adal);
				
				boolean rall = li.removeAll(li1);
				System.out.println("removed all:"+rall);
				
				boolean reall = li.retainAll(li1);
				System.out.println("retaines value is:"+reall);
				
				
		 
		 
		 
		 
		 
		 
		
		
		
}
}