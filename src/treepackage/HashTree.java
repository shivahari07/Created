package treepackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> nn=new HashMap<Integer,String>();
		//It will print in random
		nn.put(22, "mani");
		nn.put(33, "Ram");
		nn.put(44, "kumar");
		nn.put(66, "hari");
		nn.put(77, null);
		nn.put(77, "veno");
		
		System.out.println(nn);
		
		Set<Integer> kk = nn.keySet(); //return all keys as Set(Duplicate not allowed)
		System.out.println(kk);
		
		for (Integer one: nn.keySet()) {
			System.out.println(one);  // print all keys in one-by-one 
		}
			
		Collection<String> vv = nn.values(); // return all values as collection( Duplicate are allowed)
		System.out.println(vv);
		
		for (String st : nn.values()) {
			System.out.println(st); //instead String we can also let "Object"
		}
		
		HashMap<Integer,String> mm=new HashMap<Integer,String>();
			mm.put(88, "Ravi");
			
			mm.putAll(nn);
			System.out.println(mm);
			
		boolean cc = mm.containsKey(66);
		System.out.println(cc);
		
		boolean cv = mm.containsValue("ravi");
		System.out.println(cv);
		
		Set<Entry<Integer, String>> es = mm.entrySet();
		System.out.println(es);
		
		String rr = mm.remove(22);
		System.out.println(rr);
		
	
		
	}

}
