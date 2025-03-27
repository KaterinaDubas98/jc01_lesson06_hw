package com.edu.home06.start;

public class Cycle12 {

	public static void main(String[] args) {
		long pro = 1;
		int a = 1;
		
		for (int i = 1; i <= 10; i++) {
			
			a = 6 + a;
			pro *= a;
		}
		System.out.println(pro);

	}

}
