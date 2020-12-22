package com.techelevator;

import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		int firstNum = 0;
		int secondNum = 1;
		String sequenceToUpperBound = "0, 1";

		System.out.println("Please enter the Fibonacci number: ");

		int upperBoundNum = input.nextInt();

		System.out.print(sequenceToUpperBound);
		while (sum < upperBoundNum) {
			sum = firstNum + secondNum;

			if (sum < upperBoundNum) {
				System.out.print(", " + sum);
				firstNum = secondNum;
				secondNum = sum;
				
			}
		}

		System.out.println();
	}
}