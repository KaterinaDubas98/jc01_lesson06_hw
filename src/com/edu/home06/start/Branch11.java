package com.edu.home06.start;

import java.util.Scanner;

public class Branch11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		
		System.out.print("Введите площадь первого треугольника:");
		a = sc.nextDouble();
		System.out.print("Введите площадь второго треугольника:");
		b = sc.nextDouble();
		
		if (a > b) {
			System.out.print("Площадь первого треугольника больше");
		} else if (b > a){
			System.out.print("Площадь второго треугольника больше");
		} else {
			System.out.print("Площади треугольников равны");
		}
		
		sc.close();
	}

}
