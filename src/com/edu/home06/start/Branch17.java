package com.edu.home06.start;

public class Branch17 {

	public static void main(String[] args) {
		int m;
		int n;

		m = 12;
		n = 12;

		if (m != n && m > n) {
			n = m;
			System.out.println(m + " " + n);
		} else if (m != n && n > m) {
			m = n;
			System.out.println(m + " " + n);
		} else if (m == n) {
			m = 0;
			n = 0;
			System.out.println(m + " " + n);
		}

	}

}
