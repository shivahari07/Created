package array;

public class ConvertUppLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tt = "GooD MorNIng to All of TheM";
		char[] pp = tt.toCharArray();
		for (char c : pp) {
			if (Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			}

			else if (Character.isLowerCase(c)) {
				System.out.print(Character.toUpperCase(c));
			}
			System.out.print(" ");

		}

		System.out.println();
		
		String yu = "Automation Testing";
		String tr = yu.toUpperCase();
		char[] dd = tr.toCharArray();
		for (char ca : dd) {
			if (Character.isUpperCase(ca)) {
				System.out.print(Character.toLowerCase(ca));
			}
		}
		System.out.println();
		String ym = "Automation Testing";
		String[] op=ym.split(" ");
		for(int i=0; i<op.length; i++) {
			String ff=op[i];
			for(int j=ff.length()-1; j>=0; j--) {
				System.out.print(ff.charAt(j));
			}
		System.out.print(" ");
		}
		
		
		
		

	}

}
