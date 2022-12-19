package Iteration;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the range : - ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			int c=2*i-1;
			if(i==n)
				System.out.print(c);
			else
				System.out.println(c+" + ");
			
			sum=sum+c;
		}
         System.out.println("\n\n Sum of odd numbers = "+sum);
	}

}
