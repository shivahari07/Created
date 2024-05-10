package abstraction;

import polymorphism2.Fourthgen;
import polymorphism2.Thirdgen;

public class Secondgen extends Firstgen implements Thirdgen,Fourthgen {
	
	public void city() {
		String e="Madurai";
		System.out.println("Where are your reloacating to "+e);
	}
	public void bike() {
		int a=500;
		System.out.println("how many kliometer are you gone for "+a);
	}
	
	public static void main(String[] args) {
		Secondgen se=new Secondgen();
		//se.bike();
		se.city();
		se.flight();
		se.speed();
		se.State();
		se.team();
		se.money();
		se.sport();
		se.bike();
		
	}
	@Override
	public void State() {
		String p="Tami Nadu";
		System.out.println("Select the state "+p);
		
	}
	@Override
	public void team() {
		System.out.println("Select the Team as you want");
		
	}
	@Override
	public void money() {
		System.out.println("How much money are you earned");
		
	}
	@Override
	public void sport() {
		String p="Cricket";
		System.out.println("Which sport do you like "+p);
		
	}
	
	
}


