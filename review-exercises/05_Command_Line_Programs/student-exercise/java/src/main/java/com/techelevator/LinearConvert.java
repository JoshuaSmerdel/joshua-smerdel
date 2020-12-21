package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		
		
		//Input for the number to be converted.
		System.out.print("Please enter the length:");
		String usersNumberString = inputScanner.nextLine();
		int usersNumberInt = Integer.parseInt(usersNumberString);
		
		//input for the unit of measurement to be converted. 
		System.out.print("Is the measurement in (m)eters, or (f)eet?");
		String unitMeasure = inputScanner.nextLine();
		
		//using information from functions to create users answer. 
		String usersNewUnit = metersOrFeetString(unitMeasure);
		double usersNewNumber = linearConversion(usersNumberInt, unitMeasure);
		
		//output to the user.
		System.out.println(usersNumberInt + unitMeasure + " is = to " + usersNewNumber + usersNewUnit);
	}

	public static Double linearConversion(int usersNumberInt, String unitMeasure) {
		
		double usersConvertedNumber = usersNumberInt;
		boolean usersUnitMeter = unitMeasure.contains("m") || unitMeasure.contains("M");
		boolean usersUnitFeet = unitMeasure.contains("f") || unitMeasure.contains("F");
		
		if (usersUnitMeter) {
			usersConvertedNumber = usersNumberInt * 3.2808399;
		}
		else if (usersUnitFeet) { 
			usersConvertedNumber = usersNumberInt * 0.3048;
		}
		
		return usersConvertedNumber;
	}
	
	public static String metersOrFeetString(String unitMeasure) {
		
		boolean usersUnitMeter = unitMeasure.contains("m") || unitMeasure.contains("M");
		boolean usersUnitFeet = unitMeasure.contains("f") || unitMeasure.contains("F");
		String convertedMeasure = unitMeasure;
		
		if (usersUnitFeet) {
			convertedMeasure =  "Meters";			
		}
		else if (usersUnitMeter) {
			convertedMeasure = "Feet";
		}
		
		return convertedMeasure;
	}
}
