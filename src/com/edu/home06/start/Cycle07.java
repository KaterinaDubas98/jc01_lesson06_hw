package com.edu.home06.start;

public class Cycle07 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double h;
		double y;
		
		a = -8;
		b = 10;
		h = 2;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for (double x = a; x <= b; x += h) {
			if (x <=2) {
				y = -x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			} else {
				y = x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
			System.out.println("---------------------------------");
			
		}
		

	}

}
