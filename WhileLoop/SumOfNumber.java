package whileloop;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the range : - ");
		n=sc.nextInt();
		
		i=1;
		while(i<=n) {
			int c=2*i;
			if(i==n)
				System.out.print(c);
			else
				System.out.println(c+" + ");
			
			sum=sum+c;
			i++;
		}
         System.out.println("\n\n Sum of even numbers = "+sum);
	}

}
