package array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repeate {
	
	public static void test(String name) {
		char[] pp=name.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<>();
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
	
	public static void group() {
	String g="Littleandcommansession";
		int leng= g.length();
		char[] ch=g.toCharArray();
		for(int i=0;i<leng; i++) {
			for(int j=i+1; j<leng; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Show the reptating word = "+ch[i]);
				
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    test("Goodsessionmorning");
    group();
    
	}

}
