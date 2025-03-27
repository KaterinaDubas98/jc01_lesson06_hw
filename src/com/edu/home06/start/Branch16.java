package com.edu.home06.start;

import java.util.Scanner;

public class Branch16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		System.out.print("Введите точку x: ");
		x = sc.nextInt();

		System.out.print("Введите точку y: ");
		y = sc.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("Точка в первой четверти");
		}
		if (x > 0 && y < 0) {
			System.out.println("Точка во второй четверти");
		}
		if (x < 0 && y < 0) {
			System.out.println("Точка в третьей четверти");
		}
		if (x < 0 && y > 0) {
			System.out.println("Точка в четвёртой четверти");
		} else {
			System.out.println("Введены некорректные данные");
		}
		sc.close();

	}

}
