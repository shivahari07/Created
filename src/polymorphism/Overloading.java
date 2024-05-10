package polymorphism;

public class Overloading {
	
	public void Overloading() {
		String a= "Hari";
		System.out.println("Name of student is "+a);
	}
	public void Overloading(int a) {
		System.out.println("How many months does these course is planned "+a);
	}
	public void Overloading(int a, String c) {
		System.out.println("What is your native place "+c);
	}
	public void Overloading(int a, String e,int q) {
		System.out.println("What is your destination "+e+" How many year do you have exprience "+q);
	}
	public void Overloading( String c,String d) {
		System.out.println("Do you have any other question "+c+" Then we can wind up "+d);
	}

	public static void main(String[] args) {
		Overloading ov= new Overloading();
	    ov.Overloading(3);
	    ov.Overloading("No","Welcome");
	    ov.Overloading();
	    ov.Overloading(0, "Test Engineer",4);
	    ov.Overloading(0, "Madurai s");
	    
    
	}

		
	}


