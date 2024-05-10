package settype;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> my=new HashSet<Object>();
		
		my.add("mani");
		my.add("hari");
		my.add("mani");
		my.add("Car");   //it will automaticall remove dupliacte value
		my.add(null);    //it will automaticall remove null value
		my.add(null);
		System.out.println(my);
		
		System.out.println(my.size());
		
		my.remove("hari");   // We have to give value not an index
		System.out.println(my);
		
		boolean tt=my.contains("Car");
		System.out.println(tt);
		
		HashSet<Object> my1=new HashSet<Object>();
		
		my1.add(25);
		my1.add(44);
		my1.add(77);
		
		my1.addAll(my);
		System.out.println(my1);
		
		
		my1.containsAll(my);
		System.out.println(my1);
		
		my.add("Zero");   //In hashset we can't insert the value in-between the one to two value
		System.out.println(my);  //it will done only in ArrayList.
		
	System.out.println(my);
		ArrayList ui= new ArrayList(my);
		System.out.println(ui.get(1));   //Convert into Arraylist method, can access get method in hashset
		
		Iterator ht= my.iterator();
		while(ht.hasNext()) {
			System.out.print(ht.next());
		}
		System.out.println(my1.add(2));
		
		
		
	}

}
