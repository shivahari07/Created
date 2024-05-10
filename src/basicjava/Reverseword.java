package basicjava;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String g=("Hari Haran");
		char[] p=g.toCharArray();
		
		for(int i=p.length-1;i>=0;i--) {
			System.out.print(p[i]); 
		}
	
		System.out.println();
		  
		String y="Welcome to chennai";
		
		 char[] u=y.toCharArray();
		 for(int i=u.length-1;i>=0;i--) {
			 System.out.print(u[i]);
		 }
		
	}

}
