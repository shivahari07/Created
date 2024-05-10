package array;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6789;
		int rev = 0;

		while (num!= 0) {

			rev = rev * 10 + num % 10; // 0+6789%10= 9; 90+678%10=98; 980+67%10=987; 987+6%10=6  9876
			num = num / 10;            // num=678; ;       67;           6              0

		}

		System.out.print(rev);
		System.out.println();
		System.out.println("-----------------");

		int e = 456;

		StringBuffer st = new StringBuffer(String.valueOf(e));
		System.out.println(st.reverse());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int numer = sc.nextInt();

		int revs = 0;
		while (numer != 0) {
			revs = revs * 10 + numer % 10; // 0+567%10=7; 70+6=76; 760+5= 765
			numer = numer / 10;            // num= 56 ;     5 ;         0
		}
		System.out.println(revs);

	}

}
