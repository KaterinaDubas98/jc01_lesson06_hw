package com.edu.home06.start;

public class Cycle15 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum += Math.pow(2, i);
		}
		System.out.println(sum);

	}

}