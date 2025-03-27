package com.edu.home06.start;

import java.util.Scanner;

public class Branch18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int num = 0;
		
		System.out.println("Введите три числа: ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a < 0) {
			num++;
		}
		if (b < 0) {
			num++;
		}
		if (c < 0) {
			num++;
		}

		System.out.println("Количество отрицательных чисел: " + num);
		sc.close();

	}

}
