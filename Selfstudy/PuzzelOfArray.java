package com.Selfstudy;

public class PuzzelOfArray {

	public static void main(String[] args) {
		// output{120,60,40,30,24}----> 2*3*4*5 =120

		int[] num = { 1, 2, 3, 4, 5 };

		int n = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j)
					continue;
				n = n * j;
			}
			System.out.print(n + " ");
			n = 1;
			}

			// *Second method
		System.out.println(" ");

			System.out.println("***************");

			int a = 120;
			
			for (int k=1;k<=5;k++) {
				System.out.print(a / k + " ");

				
			}

			
		

	}
}