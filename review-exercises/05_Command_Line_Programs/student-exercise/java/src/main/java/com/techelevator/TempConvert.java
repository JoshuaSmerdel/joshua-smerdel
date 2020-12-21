package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		
		
		//Input for the number to be converted.
		System.out.print("Please enter the temperature:");
		String usersNumberString = inputScanner.nextLine();
		int usersNumberInt = Integer.parseInt(usersNumberString);
		
		//input for the unit of measurement to be converted. 
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String unitMeasure = inputScanner.nextLine();
		
		//using information from functions to create users answer. 
		String usersNewUnit = metersOrFeetString(unitMeasure);
		double usersNewNumber = linearConversion(usersNumberInt, unitMeasure);
		
		//output to the user.
		System.out.println(usersNumberInt + " " + unitMeasure + " is = to " + usersNewNumber + " " + usersNewUnit);
	}

	public static Double linearConversion(int usersNumberInt, String unitMeasure) {
		
		double usersConvertedNumber = usersNumberInt;
		boolean usersUnitCelsius = unitMeasure.contains("c") || unitMeasure.contains("C");
		boolean usersUnitFahrenheit = unitMeasure.contains("f") || unitMeasure.contains("F");
		
		if (usersUnitCelsius) {
			usersConvertedNumber = (usersNumberInt * 1.8) + 32;
		}
		else if (usersUnitFahrenheit) { 
			usersConvertedNumber = (usersNumberInt - 32) / 1.8;
		}
		
		return usersConvertedNumber;
	}
	
	public static String metersOrFeetString(String unitMeasure) {
		
		boolean usersUnitCelsius = unitMeasure.contains("c") || unitMeasure.contains("C");
		boolean usersUnitFahrenheit = unitMeasure.contains("f") || unitMeasure.contains("F");
		String convertedMeasure = unitMeasure;
		
		if (usersUnitCelsius) {
			convertedMeasure =  "Fahrenheit";			
		}
		else if (usersUnitFahrenheit) {
			convertedMeasure = "Celsius";
		}
		
		return convertedMeasure;
	}
}
