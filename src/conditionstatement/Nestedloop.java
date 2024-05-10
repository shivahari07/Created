package conditionstatement;

public class Nestedloop {

	public static void main(String[] args) {
		
	/*	for(int i=1; i<=6;i++) {
			for(int j=4; j<=8; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
        
		for(char i='A'; i<='H';i++) {
			for(int j=1; j<=6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		for(int i=6; i>=1;i--) {
			for(char j='D'; j<='H';j++) {
				System.out.print(i);
			}
			System.out.println();
		}  
		for(int i=1; i<=6;i++) {         //  i=1                   i=2
			for(int j=1; j<=i;j++) {     //          j<=1                  2<=1
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=5; i>1;i--) {       //    5>1; 5-1=4          4>1;   4-1= 3
			for(int j=3; j<=i;j++) {   //    3<=4  (T)                 3<=3 (T)
				System.out.print(j);
			}
			System.out.println();
		}
		for(char i='D';i<='I';i++) {        // D<=I  (T)  D++ = D,E,F,G,H,I
			for(char j='F';j>='B';j--) {    //F>=B   (T)  F-- = F,E,D,C,B
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

