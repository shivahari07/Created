package conditionstatement;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] p= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<p.length;i++) {
			if(p[i]%2==0) {
				
				System.out.println("Given even number is "+p[i]);
		}
		else {
			System.out.println("No Content");
		}
		
	}	
		
		
		
			int[] y= {1,2,3,4,5,6};
			
			for(int i=0;i<y.length;i++) {
				if(y[i]%3==0) {
					System.out.println(y[i]);
				}
				else {
					System.out.println("No waste");
				}
			}
	}

}
