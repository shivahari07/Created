package polymorphism2;

import basicjava.Adding;

public class Subclass extends Super implements Thirdgen,Fourthgen{
	
	public void movie() {
		System.out.println("I ke to go moive on sunday");
	}
	@Override
	public void car() {
		String a="BMW Car";
		System.out.println("what are Trending car is now available "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Subclass sub=new Subclass();
        sub.car();
        sub.movie();
        sub.bike();
        sub.State();
        sub.team();
     
        Adding ad= new Adding();// calling from one package to another package
        ad.add();
        sub.money();
        sub.sport();
	}
	@Override
	public void State() {
		// TODO Auto-generated method stub
		System.out.println("I am Third generation");
	}
	@Override
	public void team() {
		// TODO Auto-generated method stub
		System.out.println("I am fourth generation ");
	}
	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println(" Money is important to this world ");
	}
	@Override
	public void sport() {
		// TODO Auto-generated method stub
		System.out.println(" Sport is important to this world ");
	}
	

}
