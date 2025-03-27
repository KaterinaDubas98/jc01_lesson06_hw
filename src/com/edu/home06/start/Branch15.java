package com.edu.home06.start;

public class Branch15 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double x;
		
		a = 31;
		b = 24;
		x = 0;
		
		if (a < b) {
			x = a;
			a = (a + b) / 2;
			b = (x + b) * 2;
			System.out.println(a + " " + b);
		} else if (b < a) {
			x = b;
			b = (a + b) / 2;
			a = (x + a) * 2;
			System.out.println(b + " " + a);
		}

	}

}
