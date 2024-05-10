package treepackage;

import java.util.TreeMap;

public class TreeMapModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> nn= new TreeMap<Integer,String>();
		nn.put(22, "mani");
		nn.put(66, "hari");
		nn.put(44, "kumar");
		nn.put(77, null);
		nn.put(33, "Ram");
		nn.put(77, "veno");
		
		System.out.println(nn);
		
		System.out.println(nn.keySet());
		
		System.out.println(nn.values());
		
		System.out.println(nn.containsKey(77));
		
		System.out.println(nn.entrySet());
	}

}
