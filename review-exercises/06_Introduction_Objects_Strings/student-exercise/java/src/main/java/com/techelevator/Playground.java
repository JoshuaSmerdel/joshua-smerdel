package com.techelevator;

public class Playground {

	public static void main(String[] args) {

//		int index0 = 0;
//		String string9 = "0123456789";
//		
//		String sub5 = string9.substring(0, 5);
//		String sub3 = string9.substring(0, 3);
//		String sub1 = string9.substring(index0 +1, index0 +2);
//		int string9Length = string9.length();
//		
//		System.out.println(sub5);
//		System.out.println(sub3);
//		System.out.println(sub1);
//		System.out.println(string9Length);
		
		String str = "brookiecookie";
		String newString1 = "";
		boolean theyMatch = str.charAt(2) == str.charAt(3);
		String last2 = last2 + str.charAt(str.length() - 2) + str.charAt(str.length() -1);
	
		
		for (int i = 0; i < str.length(); i++) {
			newString1 = newString1 + str.substring(0,i);
		}
			
			System.out.println(last2);
		
		
		
		
	}

}
