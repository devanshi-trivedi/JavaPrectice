package com.Selfstudy;

public class TwoNumbersTotal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		printTwoNumbers(a, 10);

	}

	public static void printTwoNumbers(int[] a, int b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > 0; j--) {
				if (a[i] + a[j] == b) {
					if (a[i] == a[j] || a[i] > a[j])
						break;
					System.out.println(a[i] + " ," + a[j]);
				}

			}
		}

	}

}
