package Sequence;

import java.util.Scanner;

public class DistanceConversion {

	public static void main(String[] args) {
		
		double km,m,cm,mm;
		
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the distance in kilometers");
        
        km=input.nextDouble();
        
        m=1000*km;
        cm=100*m;
        mm=10*cm;
        
        System.out.println("Distance in kilometers ="+km);
        System.out.println("Distance in meters ="+m);
        System.out.println("Distance in centimeters ="+cm);
        System.out.println("Distance in milimeters ="+mm);
        
        

	}

}
