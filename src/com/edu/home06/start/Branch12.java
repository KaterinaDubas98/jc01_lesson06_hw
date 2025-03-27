package com.edu.home06.start;

public class Branch12 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double a2;
		double b2;
		double c2;
		
		a = 7;
		b = -6;
		c = -2;
		
		if (a > 0) {
			a2 = Math.pow(a, 3);
			System.out.println("а^3 = " + a2);
		} else {
			a2 = Math.pow(a, 4);
			System.out.println("а^4 = " + a2);
		}
		
		if (b > 0) {
			b2 = Math.pow(b, 3);
			System.out.println("b^3 = " + b2);
		} else {
			b2 = Math.pow(b, 4);
			System.out.println("b^4 = " + b2);
		}
		
		if (c > 0) {
			c2 = Math.pow(c, 3);
			System.out.println("c^3 = " + c2);
		} else {
			c2 = Math.pow(c, 4);
			System.out.println("c^4 = " + c2);
		}
		

	}

}
