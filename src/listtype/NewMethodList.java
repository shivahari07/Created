package listtype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewMethodList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> hh=new ArrayList<Object>();
		hh.add("Hari");
		hh.add(23);
		hh.add("Bike");
		hh.add(88);
		hh.add("Team");
		
		System.out.println(hh);
		
		
		System.out.println(hh.get(1));
		
		hh.set(2, "Car");
		System.out.println(hh);
		
		hh.add("Money");
		System.out.println(hh);
		
		hh.add(2,"house");
		System.out.println(hh);
		
		Iterator ii=hh.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		List<Object> yy= new ArrayList<Object>();
		
		yy.add("Shiva");
		yy.add(89);
		yy.add(88);
		yy.add("Mahi");
		yy.add("Team");
		
		System.out.println(yy);
		
		yy.addAll(hh);
		System.out.println(yy);
		
	    yy.retainAll(hh);    // if second list is having a same values only those
	    System.out.println(yy); // value will be show ex: Team,88
	    
	   boolean rr= yy.contains("Team");
	    System.out.println(rr);
	    
	    Iterator itr = yy.iterator();
	     while(itr.hasNext()) {            //by using iterator also we can remove
	    	if( itr.next().equals("Hari")) 
	    		itr.remove();
	     }
			System.out.println("new line "+yy);
	    
	    yy.removeAll(hh);         // new 
	    System.out.println(yy);
	    
	    System.out.println(yy.isEmpty());

	}

}
