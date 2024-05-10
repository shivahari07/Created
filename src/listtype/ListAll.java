package listtype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	List<Object> ob= new ArrayList<Object>();
		
		ob.add("Car");
		ob.add(27);
		ob.add("Hari HARAN");
		ob.add(null);
		ob.add(null);
		ob.add(27);
		
		System.out.println(ob);
	
		
		int dd=ob.size();
		System.out.println(dd);
		
		int ri=ob.indexOf(null);
		System.out.println(ri);
		
		ob.remove(5);
		System.out.println(ob);
		
		ob.set(2, "Hari Shiva");
		System.out.println(ob);
		
		System.out.println(ob.get(2));
		
		ob.add(2,"House");
		System.out.println(ob);
		
		for(int i=0; i<ob.size();i++) {
			System.out.println(ob.get(i));
		}
		System.out.println("------------------");
		
		Iterator uu=ob.iterator();
		while(uu.hasNext()) {
			System.out.println(uu.next());
		
		}
		System.out.println(ob);
		//ob.indexOf(3);
		System.out.println(ob.indexOf(null));
		
		ob.remove("House");
		System.out.println(ob);
		
	    // Integer iy=ob.get(1);
	     System.out.println(ob.get(1));
	     
	     System.out.println(ob);
	     
	     List<Object> ob1= new ArrayList<Object>();
	     
	     ob1.add("CSK Team");
	     ob1.add("Car");
	     
	     ob1.addAll(ob);
	     System.out.println(ob1);
	     
	     ob1.remove(5);
	     System.out.println(ob1);
	     
	    System.out.println(ob1);
	    
	  
	     ob1.clear();
	 	System.out.println(ob1);
	 	
	 	boolean de=ob1.isEmpty();
	 	System.out.println(de);
	 	
	 	
	     
	 
			
	     
	}

}
