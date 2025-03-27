package com.edu.home06.start;

public class Branch14 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 97;
		b = 90;
		
		c = 180 - a - b;
		
		if (c > 0 && ((a == 90) || (b == 90) || (c == 90))) {
			System.out.println("треугольник существует и является прямоугольным");
		} else if (c > 0 && ((a != 90) || (b != 90) || (c != 90))) {
			System.out.println("треугольник существует, но не является прямоугольным");
		} else {
			System.out.println("Треугольника с заданными углами не существует");
		}
			

	}

}
