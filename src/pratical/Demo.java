package pratical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Demo {
	
	private static void test() {
        String d="Many More Happy returns of day";
        
        char[] pp=d.toCharArray();
        
        Map<Character,Integer> map= new LinkedHashMap<>();
        for (char c : pp) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
			
		}
        System.out.println(map);
        
        
        
        
        
        
         
	}      
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		test();
	
	
	    
	    
	    
	    
		
	}
}
		
		
		
		

	

