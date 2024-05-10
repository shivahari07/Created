package constructor;

public class Normal {
	
	String f;
	int r;
	
	Normal(){
		String g="First";
		System.out.println("Which constructor has benn executed - "+g);
	}
	Normal(int a){
		System.out.println("Which menthod has been executed - "+a);
	}
	Normal(int a,String g){
		System.out.println("What are combination has mentioned "+a+" Name of "+g);
	}
	Normal(String g,int a){
		System.out.println("Echange offer is printed "+g+" Amount "+a);
	}
	Normal(String a,String b,String c){
		System.out.println("Finally it comes to an end "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Normal nr=new Normal();
        System.out.println(nr.f);
        System.out.println(nr.r);
        Normal nr1= new Normal(2);
        Normal nr2= new Normal(3,"double parameter");
        Normal nr3= new Normal("Store",99);
        Normal nr4= new Normal("Store","Shipping","exchange");
        
	}

}
