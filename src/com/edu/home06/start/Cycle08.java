package com.edu.home06.start;

public class Cycle08 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double h;
		double y;

		a = 1;
		b = 20;
		c = 4;
		h = 2;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x += h) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
			if (x != 15) {
				y = (x - c) + 6;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
			System.out.println("---------------------------------");

		}

	}

}