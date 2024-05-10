package array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String op=("Java Class");
		char[] kk=op.toCharArray();
		for(int i=kk.length-1; i>=0;i--) {  // why we using i=kk.lenght-1 means for reverse 
			System.out.print(kk[i]); // we to start from last letter .
		}
		System.out.println();
		
		String ss=("Good Morning");
	    char[] pp=ss.toCharArray();
	    for(int i=0; i<pp.length-1; i++) { // it is ascending 
	  	  System.out.print(pp[i]);  
	  	  }
	    System.out.println();
		
		String tt=("learning Java");
		StringBuffer sb= new StringBuffer(tt);  //by using String buffer reverse method
		System.out.println(sb.reverse());
		
		
		  String[] vv= {"one","two","three","four"};
		  for(int i=vv.length-1; i>=0; i--) {
			  System.out.println(vv[i]);  
		  }
		  System.out.println("-----------");
		  
		  String th=("Welcome to singara chennai");
			String[] sp = th.split(" ");
			for(int i=0; i<sp.length; i++) {    // print the word as it is order but all letter will
				String str = sp[i];             // be reversed
				for(int j=str.length()-1; j>=0; j--) {
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
			}
			System.out.println();
			
			String ff=("Welcome to Madurai");
			String rev= "";
			char[] ca = ff.toCharArray();   // orginal String program
			for(int i=ca.length-1; i>=0; i--) {
				rev= ca[i]+rev;
			
			}
			System.out.println(rev);
	      
			String s = "JaVaPrOgRaM";
			
			for(int i=0;i<s.length();i++) {  // print only even number char
				
				if(i%2  != 0) {   //0%2=0(J); 1%2= 1(a); 2%2=0(v);
				System.out.print(s.charAt(i));
				}
			}
		      
	      
	}

}
