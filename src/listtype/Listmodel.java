package listtype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Listmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> h = new ArrayList<Integer>();
		h.add(44);
		h.add(55);
		h.add(66);
		h.add(35);
		h.add(70);
		h.add(99);
		
		

		System.out.println(h);

		int e = h.get(2);
		System.out.println(e);

		h.set(1, 100);
		System.out.println(h);

		h.remove(2); //We will pass index value 
		System.out.println(h);

		int index = h.indexOf(100);
		System.out.println(index);
		
		int z=h.indexOf(99);
		System.out.println(z);

		for (int i = 0; i < h.size(); i++) {
			System.out.println(h.get(i));
		}

		for (Integer in : h) {
			System.out.println(in);
		}

		String y = "Hello World";
		int h1 = y.indexOf("W");
		System.out.println(h1);
		System.out.println("Boolean"+y.isEmpty());

		int ww = h.size();
		System.out.println(ww);
		
		System.out.println("Whether is it printing");
		
		

		/*
		  List<String> hy= new ArrayList<String>();
		  hy.add(""); boolean
		  ds=hy.isEmpty(); System.out.println(ds);
		 */

		ListIterator<Integer> it = h.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}
		System.out.println(h);
		
		Iterator<Integer> bb= h.iterator();
		while(bb.hasNext()) {
			System.out.println(bb.next());
		}

	}

}
