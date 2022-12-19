package Iteration;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the range : - ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			int c=i;
			if(i==n)
			System.out.print(c);
			else
				System.out.println(c+" + ");
			sum=sum+c;
		}
		System.out.println("\nSum of natural number "+sum);
		
			

	}

}
