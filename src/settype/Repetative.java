package settype;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import pratical.Demo;

public class Repetative {
	
	public static void type() {
		String s ="Hello,is,the,Hello,is,is,the,is,this";
		
		String[] give=s.split(",");
		Map<String, Integer> word= new HashMap<String, Integer>();
		for (String string : give) {
			if(word.containsKey(string)) {   
				Integer yy=word.get(string);//   hello=2    the = 2
				word.put(string, yy+1);     //is =1 ; is=2 ;is=3 ;is=4
			}else {
				word.put(string, 1); // =>    hello =1    the = 1
			}
		}
		System.out.println("enter the second value");	
			Set<Entry<String,Integer>>entrylarge=word.entrySet();
			for(Entry<String,Integer>entry:entrylarge) {
				if(entry.getValue()>1) {
					String ff=entry.getKey();
					int dd=entry.getValue();
					System.out.println(ff+"="+dd);
				}
			}
			
		
		}	
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		type();
	
		
		
	
	}

}



