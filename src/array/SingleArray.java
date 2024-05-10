package array;

public class SingleArray {

	public static void main(String[] args) {
		
      //datatype[] refname=new datatype(legth);
	/*	int[] a=new int[5];
		a[0]=22;
		a[1]=11;
		a[2]=33;
		a[3]=44;
		a[4]=55;
	
		//System.out.println(a);// Array we should not directly call the reference value
		                      // it will show the memory of value.
		
		System.out.println(a[3]);
		for(int i=0; i<=a.length;i++) {
			System.out.println(a[i]);
		} */
		
	/*	String[] u= {"Mon","Tue","Wed","Thu","Fir"};
		
		for(int i=0; i<=u.length;i++) {
			System.out.println(u[i]);
		}
		
		int[] t= {1,2,3,4,5,6,7};
		for(int i=0; i<=t.length; i++) {
			System.out.println(t[i]);
		}   */
		String[] u= {"Mon","Tue","Wed","Thu","Fir"};
	//---------------------------------------------------
    //Foreach Loop
		for (String st : u) {
			System.out.println(st);
		}
		int[] t= {1,2,3,4,5,6,7};
		for(int tt:t) {
			System.out.println(tt);
		}
		String[]fh= {"hari","mahi","rahul","mani"};
		for(int i=0; i<fh.length; i++) {
			System.out.println(fh[i]);
		}
			int[] a=new int[3];
			a[0]=22;
			a[1]=11;
			a[2]=33;
			a[3]=44;
			
		
			
			for(int k=0; k<a.length;k++) {
				System.out.println(a[k]);
			} 
		
	}

}
