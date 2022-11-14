package Sequence;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int area,peri,len,width;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and width of rectangle");
		
		len=sc.nextInt();
		width=sc.nextInt();
		
		area=len*width;
		peri=2*(len+width);
		
		System.out.println("Area of rectangle ="+area);
		System.out.println("Perimeter ="+peri);

	}

}
