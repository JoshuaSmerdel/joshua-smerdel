package com.techelevator;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Fibonacci {

	public static void main(String[] args)
	{
		DecimalFormat df2 = new DecimalFormat("#");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to see it's place in the Fibonacci Sequence: ");
		String fibIntString = scanner.nextLine();
		int fibInt = Integer.parseInt(fibIntString);
		double fibSeq1 = fibInt / 1.618;  //using golden ratio and reducing double to whole number using "decimal format"
		double fibSeq2 = fibSeq1 / 1.618;  // golden ration is very close to Fibonacci.  when reduced to a whole number it's indistinguishable 

		System.out.print("the number " + fibInt + " would be preceded in the Fibonacci Sequence by " + df2.format(fibSeq1) + " & " + df2.format(fibSeq2));
	} 
	
}