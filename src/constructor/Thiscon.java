package constructor;

import pratical.Pratice;

public class Thiscon {
	
	Thiscon(){
		System.out.println("first Normal value");
	}
	Thiscon(int a){
		this(67,55,66);
		System.out.println("Number is printed");
	}
	Thiscon(String a,int b){
		this(5);
		System.out.println("combination of letter and number");
	}
	Thiscon(int a, String b){
		
		System.out.println("combination of Number and Letter");
	}
	Thiscon(int a,int b,int c){
		this(4,"hello");
		System.out.println("Final method");
	}
	/*
	 Pratice(){
		System.out.println("Enter the first line");  //1
	}
	Pratice(int a){
		
		this(3,"kk");
		String y1=("Ok i will print");
		System.out.println("Enter the second line"+y1);  //3
	}
	Pratice(int a,String c){
		this();
		String c1=("Yes I will");
		System.out.println("Have you ever gone through"+c1); //2
	}
	Pratice(String c, int a){
		this("n","m","p");                  //5
		System.out.println("It doesn't matter"+a);
	}
	Pratice (String d,String c,String v){
		this(7);
		String c1=("yes it correct");
		String v1=("Cool");                      //4
		System.out.println("Enter the fivth line "+c1+" Hey you just aced it "+v1);
	}

	 */

	public static void main(String[] args) {
		
		Thiscon con= new Thiscon("hy",3);
		//Pratice pp3= new Pratice("",5);
		

	}

}
