package Selection;

import java.util.Scanner;

public class EvenOrOdd2 {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		
		num=sc.nextInt();
		if(num%2==0)
			System.out.println(num+"is even");
		if(num%2!=0)
			System.out.println(num+"is odd");

	}

}
