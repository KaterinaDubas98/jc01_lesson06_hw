package com.edu.home06.start;

public class Cycle16 {

	public static void main(String[] args) {
		 int x;
		 int y;
		 
		 x = 0;
		 y = 1;
		 
		 for (int i = 1; i <= 10; i++) {
			 x += i;
			 y *= x;
		 }
		 System.out.println(y);

	}

}
