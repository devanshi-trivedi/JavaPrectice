package com.Selfstudy;

import java.util.Arrays;

public class Duplicate {
	
	public static String removeDuplicate(char[] str1, int n) {
		
		int index = 0;
		
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(str1[i] == str1[j]) {
					break;
					
				}
			}
			
			if(i== j) {
				
				str1[index] = str1[i];
				index++;
			}
		}
		
		return String.valueOf(Arrays.copyOf(str1,index));
	}
	
	

	public static void main(String[] args) {
	
		String str = "Srinidhi";
		char[] str1 = str.toCharArray();
		int n = str1.length;
		System.out.println(removeDuplicate(str1,n));

	}

}
