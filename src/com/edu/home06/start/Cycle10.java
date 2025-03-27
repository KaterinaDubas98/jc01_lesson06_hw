package com.edu.home06.start;

import java.math.BigInteger;

public class Cycle10 {

	public static void main(String[] args) {

		BigInteger a = BigInteger.valueOf(1);

		for (int i = 2; i <= 200; i++) {
			a = a.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(a);

	}

}
