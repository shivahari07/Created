package settype;

import java.util.Iterator;
import java.util.TreeSet;

public class Treemodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		TreeSet<String> pop= new TreeSet<String>();
		
		pop.add("Run");
		pop.add("Jump");
		pop.add("clean");
		pop.add("Way");
		pop.add("Mixed");
		
		System.out.println(pop);
		
		int ss=pop.size();
		System.out.println(ss);
		
		
		System.out.println(pop.first());
		
		System.out.println(pop.last());
		
		TreeSet<Integer> vv= new TreeSet<Integer>();
		vv.add(1);
		vv.add(4);
		vv.add(7);
		vv.add(9);
		vv.add(15);
		vv.add(3);
		
		System.out.println(vv);
		
		//headset lesser than 4, print beyond 4 value
		System.out.println(vv.headSet(4));
		
		//tailset greater than 7
		System.out.println(vv.tailSet(7));
		
		// it mentioned 3 greater than and below 9
		System.out.println(vv.subSet(3, 9));
		
		System.out.println(vv.higher(7));
		
		System.out.println(vv.lower(3));
		
		//Once poll first get the value then it automatically deleted from this row
		System.out.println(vv.pollFirst());
		
		//Once last get the value then it automatically deleted from this row
		System.out.println(vv.pollLast());
		
		System.out.println(vv);
		
		Iterator kk=vv.iterator();
		while(kk.hasNext()) {
			System.out.println(kk.next());
		}
		
		System.out.println(vv.descendingSet());
		
		
		
		
		
		
		
	}

}
