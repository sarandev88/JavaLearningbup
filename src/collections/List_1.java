package collections;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
//	add
//	size
//	get
//	contains
//	indexof
//	remove
//	set
//	clear
//	addall
//	removeall
//	retainall
	
	public static void main(String[] args) {
		
List<Integer> li = new ArrayList<Integer>();
//add
li.add(50);
li.add(100);
li.add(82);
li.add(1000);
System.out.println(li);


//set replace
System.out.println("replace list is:");
li.set(1, 500);
System.out.println(li);


//size
int size = li.size();
System.out.println("size of all is:"+size);

//get
Integer Hi = li.get(3);
System.out.println("The value at seond is :" +Hi);

//contains()

boolean contains = li.contains(1000);
System.out.println("the vale is :"+contains);

//remove()
li.remove(1);
System.out.println(li);

//indexof
int io = li.indexOf(3);
System.out.println(io);

//remove






		
	}

}
