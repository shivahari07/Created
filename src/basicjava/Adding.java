package basicjava;

public class Adding {

	int m1=100;       // class variable
	int m2=200;
	int m= m1+m2;
	int d=100;
	
	public void add() {
		System.out.println("Sum of Total Amount"+m);
		System.out.println("Given some number"+d);
	}
	
	public void letter() {
		String s="Lion";          //Local variable
		System.out.println("Who is king of Forest "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Adding ad= new Adding();
     ad.add();
     ad.letter();
	}

}
