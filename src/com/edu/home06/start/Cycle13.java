package com.edu.home06.start;

public class Cycle13 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;

		a = -5;
		b = 5;
		h = 0.5;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x += h) {
			y = 5 - (x * x / 2);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			System.out.println("---------------------------------");
		}
		

	}

}
