package map_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkHmap {
	
	public static void main(String[] args) {
//	Map<Integer, Integer> m1 = new LinkedHashMap<Integer, Integer> ();
//	m1 .put(1, 2000);
//	m1 .put(2,5000);
//	m1 .put(3, 5896);
//    System.out.println("the printed value is:"+m1 );
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(2, "1500");
		mp.put(3, "2500");
		mp.put(4, "sairam");
		System.out.println("entered text is:"+mp);
		
		
		//size()
		
		int sz = mp.size();
		System.out.println("size of the map is:"+sz);
		
		//get
		
		String gt = mp.get(2);
		System.out.println("getted value is:"+gt);
		
//		values
		
		Collection<String> va = mp.values();
		System.out.println("value of the map is:"+va);
		
		
		//containskey
		
		boolean ckey = mp.containsKey(5);
		System.out.println("entered ckey is available:"+ckey);
		
		//cobtainsvalue
		
		boolean cval = mp.containsValue("2500");
		System.out.println("does it contain value:"+cval);
		
		//keyset()
		
		Set<Integer> kse = mp.keySet();
		System.out.println("key set value is:"+kse);
		
		//entryset
		
//		Set<Entry<Integer, String>> eset = mp.entrySet();
//		for (Entry<Integer, String> entry : eset) {
//			System.out.println(eset);
//			
//		}
	
		Set<Entry<Integer, String>> ents = mp.entrySet();
		for (Entry<Integer, String> entry : ents) {
			System.out.println("entry set value is:"+entry);
			
		}
    
	}
}
