package com.edu.home06.start;

public class Cycle14 {

	public static void main(String[] args) {

		int n;
		double sum;

		n = 10;
		sum = 0;

		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}

		System.out.println(sum);

	}

}
