package DoWhile;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
      int i,num;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter any number");
      num=sc.nextInt();
       
      i=2;
      do
      {
       
    	  if(num%i==0) 
    		  System.out.println(num+"is not a prime number");
    		  
    			  System.out.println(num+"is a prime number");
    		  i++;
    		  break;
    	  
    		  
    		  
    		  }while(i<num);
	}
    		  
    	  
      }
	


