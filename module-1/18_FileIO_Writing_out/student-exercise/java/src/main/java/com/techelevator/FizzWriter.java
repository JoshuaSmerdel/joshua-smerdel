package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {

//		-----INSTRUCTIONS------
//		Create a program to write out the result of FizzBuzz (1 to 300)
//		to a file called FizzBuzz.txt. The file should be written out to
//		the same directory as this README file.
//
//		If the number is divisible by 3 or contains a 3, print “Fizz.”
//		If the number is divisible by 5 or contains a 5, print “Buzz.”
//		If the number is divisible by 3 and 5, print “FizzBuzz.”
//		Otherwise, print the number.

//		file creation and write functions
		File fizzBuzzTxt = new File("FizzBuzz.txt");
		PrintWriter fizzBuzzWrite = new PrintWriter(fizzBuzzTxt.getAbsolutePath());


//		Loop to test numbers 1-300 for fizzbuzz
		for (Integer counter = 0; counter <= 300; counter++){

//			variables for program
			boolean fizzBuzz = counter % 3 == 0 && counter % 5 == 0;
			boolean fizz = counter % 3 == 0;
			boolean buzz = counter % 5 == 0;
			boolean containsThree = counter.toString().contains("3");
			boolean containsFive = counter.toString().contains("5");

//			if/else's to qualify FizzBuzz parameters and output result to FizzBuzz.txt
			if (fizzBuzz){
				fizzBuzzWrite.println("FizzBuzz" + "(" + counter + ")");
			} else if (fizz || containsThree){
				fizzBuzzWrite.println("Fizz" + "(" + counter + ")");
			} else if (buzz || containsFive){
				fizzBuzzWrite.println("Buzz" + "(" + counter + ")");
			} else{
				fizzBuzzWrite.println(counter);
			}
		}

		fizzBuzzWrite.close();
		System.out.println("FizzBuzz.txt has been created.");

	}

}
