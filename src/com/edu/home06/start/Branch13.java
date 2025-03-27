package com.edu.home06.start;

public class Branch13 {

	public static void main(String[] args) {
		
		int x1, y1;
		int x2, y2;
		double lengthA;
		double lengthB;
		
		x1 = 3;
		y1 = 2;
		x2 = 3;
		y2 = 2;
		
		lengthA = Math.sqrt(x1*x1 + y1*y1);
		lengthB = Math.sqrt(x2*x2 + y2*y2);
		
		if (lengthA > lengthB) {
			System.out.println("Точка В ближе к началу координат");
		} else if (lengthB > lengthA) {
			System.out.println("Точка A ближе к началу координат");
		} else {
			System.out.println("Точки равноудалены от начала координат");
		}

	}

}
