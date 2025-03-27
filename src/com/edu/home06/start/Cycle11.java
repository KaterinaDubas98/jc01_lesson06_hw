package com.edu.home06.start;

public class Cycle11 {

	public static void main(String[] args) {
		long sum;

		sum = 0;

		for (long i = 1; i <= 200; i++) {
			sum -= Math.pow(i, 3);
		}
		System.out.println(sum);

	}

}
