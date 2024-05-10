package stringtype;

public class StringBufferline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="Mumbai Indians";
		st="Chennai kings";  //it will get latest object what we provide
		System.out.println("Enter current team "+st.concat(" Gujarat"));//Stored inside the heap memory
	    System.out.println("So that we call string is immutable");
	    
	    
	    String si= new String("Mumbai");
	    String sj= new String("Mumbai");//Stored in heap memory, 
	    System.out.println("Is it equal?"+(sj==si));
	    System.out.println("So that we call new keyword is mutable");
	    System.out.println("************************");
	    
	    StringBuffer sb= new StringBuffer(" Scachin"); // it will override the existing object
	    StringBuffer sb1= new StringBuffer(" Scachin Tendulkar");
	    System.out.println("Enter the full name"+sb.append(sb1));
	    System.out.println("So that we call string is mutable");
	    System.out.println("************************");
	    
	    StringBuffer ss= new StringBuffer("HARI HARAN");
	    System.out.println("Enter reverese value "+ss.reverse());
	    
	    StringBuffer sf= new StringBuffer("HARI HARAN");
	    System.out.println("Enter Replace word "+sf.replace(5, 10, "Shiva"));
	    
	    StringBuffer sg= new StringBuffer("HARI HARAN");
	    System.out.println("Enter insert value "+sg.insert(10, " Shiva"));
	    
	    StringBuffer sd= new StringBuffer("HARI HARANjSHIVA");
	    System.out.println("Delete the word "+sd.delete(11, 14));// before 11 and in-between from 12 to 14.
	    
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
