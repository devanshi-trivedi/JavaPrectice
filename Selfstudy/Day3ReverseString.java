package com.Selfstudy;

public class Day3ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		String str1 = "srinidhi";
		
		StringBuffer sb = new StringBuffer("srinidhi");
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println("*******");
		
		String str = "Srinidhi";
		
		
		for(int i=str.length()-1;i>0;i--) {
			System.out.print(str.charAt(i));
		}


		
		
	}

}
