package array;

public class AddingReverse {

	private static int add() {
		// TODO Auto-generated method stub

	
	 int numb=567;
     int revv=0;
     
     while(numb>0) {
    	 
    	 int add=numb%10;   //678%10=8;  67%10=7;  6%10= 6  (Reminder)
    	 revv= revv+add;    //0+8=8;       8+7=15;    15+6=21
    	 numb=numb/10;       // 67;       6;             0  (co-efficient)
    	
     }
     return revv;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(add());
	}

}
