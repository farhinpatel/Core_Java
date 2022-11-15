package Selection;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter any three numbers : -");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if(a<b) {
			if(a<c)
				System.out.println(a+"is the smallest number");
			else
				System.out.println(c+"is the smallest number");
			
		}
		else {
			if(b<c)
				System.out.println(b+"is the smallest number");
			else
				System.out.println(c+"is the smallest number");
		}

	}

}
