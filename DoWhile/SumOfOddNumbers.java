package DoWhile;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the range : - ");
		n=sc.nextInt();
		
		i=1;
		do
		{
	
			int c=2*i-1;
			if(i==n)
				System.out.print(c);
			else
				System.out.println(c+" + ");
			
			sum=sum+c;
			i++;
		
         
	}while(i<=n);
		System.out.println("\n\n Sum of odd numbers = "+sum);
	}

}
