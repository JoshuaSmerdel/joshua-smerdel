package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException{
		
//		1 - ask the user for a string to search for.
		Scanner userSearchInput = new Scanner(System.in);
		Scanner caseYesOrNoInput = new Scanner(System.in);
		System.out.println("What term would you like to search for?");
		String userSearchTerm = userSearchInput.nextLine();
		System.out.println("Should the search be case insensitive (Y/N)?");
		String  caseYesOrNo = caseYesOrNoInput.nextLine();
		boolean caseSen = caseYesOrNo.contains("y") || caseYesOrNo.contains("Y");
		String searchTermCap = userSearchTerm.substring(0, 1).toUpperCase() + userSearchTerm.substring(1);
		String searchTermLow = userSearchTerm.toLowerCase();
		
//		2 - ask the user for a file system path for a text file
		Scanner userFileInput = new Scanner(System.in);
		System.out.println("What file would you like to search?");
		File usersFile = new File(userFileInput.nextLine());
		
//		2.1 - verify the file exists
		if (usersFile.exists()) {
			System.out.println(usersFile + " = found!");
		} else {
			System.out.println(usersFile + " = not found!");
		}
		
//		3. search the file for occurrences of the search string.
		String tempLine = "";
		int lineNumber = 0;
		Scanner usersFileScanner = new Scanner(usersFile);
		while (usersFileScanner.hasNext()) {
			lineNumber += 1;
			tempLine = usersFileScanner.nextLine();
			if (caseSen && tempLine.contains(searchTermCap) || tempLine.contains(searchTermLow)) {
				System.out.println(lineNumber + " " + tempLine);
			} else if (tempLine.contains(userSearchTerm)) {
				System.out.println(lineNumber + " " + tempLine);
			}

		}
		usersFileScanner.close();
		


//		5. modify the program to ask whether search should be case insensitive. 

	}
	

}
