package conditionstatement;

import java.util.Scanner;

public class Scannerline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter sum number");
       int d=sc.nextInt();
       System.out.println("Given some number"+d);
      
       int i=sc.nextInt();
       for(;i<=9;i++) {
    	   for(int j=1;j<=5;j++) {
    		   System.out.print(i);
    	   }
    	   System.out.println();
       }
   
    /*   int e=sc.nextInt();
       System.out.println("Enter two number");
      for(; e<=5;i++) {
			for(int j=1; j<=6;j++) {
				System.out.print(j);
			}
			System.out.println();
		}  
       */
       
       Scanner sd= new Scanner(System.in);
		System.out.println("Enter the number");
		int w=sd.nextInt();
		for(;w<=5;w++) {
			System.out.print(w);
		}
		System.out.println();
		System.out.println("Enter name of your first character");
		String hh=sd.next();
		System.out.println("Your name is "+hh);
		
		int y=sd.nextInt();
		for(;y<=5;y++) {
			for(int f=0; f<=y;f++) {
				System.out.print(y);
			}
			System.out.println();
		}
       
	}
}



