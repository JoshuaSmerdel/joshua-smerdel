package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray)
	{
		List<String> fruitList = new ArrayList<String>();
		
		for (int i = 0; i < stringArray.length; i++) 
		{
			fruitList.add(stringArray[i]);
		}
			return fruitList;
		
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList)
	{
		String[] fruitList2 = new String[stringList.size()];
		
		for (int i = 0; i < stringList.size(); i ++)
		{
			fruitList2[i]= stringList.get(i);
		}
		
		return fruitList2;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray)
	{
		List<String> moreThan4 = new ArrayList<String>();
		
		for (String i: stringArray)
		{
			if (i.length() != 4) 
			{
				moreThan4.add(i);
			}
		}
		return moreThan4;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray)
	{
		List<Double> dividedByTwo = new ArrayList<Double>();
		
		for (int i: intArray) 
		{
			dividedByTwo.add(i * 0.5);
		}
		
		return dividedByTwo;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	
	// found how to pull last index here:  https://stackoverflow.com/questions/687833/how-to-get-the-last-value-of-an-arraylist
	// found how to sort list here: https://beginnersbook.com/2013/12/how-to-sort-arraylist-in-java/
	
	public Integer findLargest(List<Integer> integerList)
	{	
		Collections.sort(integerList);
		Integer largestValue = integerList.get(integerList.size()-1);
		
		return largestValue;
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray)
	{
		List<Integer> theOddCouple = new ArrayList<Integer>();
		
		for (int i: integerArray) 
		{
			if (i % 2 != 0) 
			{
				theOddCouple.add(i);
			}
		}
		
		return theOddCouple;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind)
	{
		int twoTimesACharm = 0;
		
		for (int i: integerList) 
		{
			if (i == intToFind) 
			{
				twoTimesACharm = twoTimesACharm + 1;
			}
		}
		if (twoTimesACharm >= 2) 
		{
			return true;
		}
		else
		
		return false;
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
	** INTERVIEW QUESTION **
	
	fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString()
	 equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray)
	{
		List<String> fizzyListy = new ArrayList<String>();
		
		for (Integer i: integerArray) 
		{
			if (i % 5 == 0 && i % 3 == 0) 
			{
				i = 53;
				fizzyListy.add(i.toString());
			}
			else if (i % 3 == 0) 
			{
				i = 3;
				fizzyListy.add(i.toString());
			}
			else if (i % 5 == 0) 
			{
				i = 5;
				fizzyListy.add(i.toString());
			}
			else
			{
				fizzyListy.add(i.toString());
			}
			
		}
		Collections.replaceAll(fizzyListy, "3", "Fizz");
		Collections.replaceAll(fizzyListy, "5", "Buzz");
		Collections.replaceAll(fizzyListy, "53", "FizzBuzz");
		
		
		return fizzyListy;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 
	 I was unable to write working code for this on my own.  My code/logic is commented out
	 below the working code which I found here:
	 http://www.sr2jr.com/textbook-solutions/computer-science/71101016/building-java-programs-a-back-to-basics-approach-arraylists
	 
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo)
	{
		int i = 1;
		int j = 0;
	
		
		while(j < listTwo.size())
		{
			if(i < listOne.size())
			{
				listOne.add(i, listTwo.get(j));
				i += 2;
			}
			else
			{
				listOne.add(listTwo.get(j));
				i++;
			}

			j++;
		}
		return listOne;
	}
	
}
	
	
	
	
/*	{
		
		List<Integer> oneAndTwo = new ArrayList<Integer>();
		int k = 0;
		
		for (int i = 0; i < listOne.size(); i ++ )
		{
			oneAndTwo.add(i);
			for (int j = 0; i < listTwo.size(); j ++)
			{
				oneAndTwo.add(j);
				k = i;
			}
		}
		if (listOne.size() > listTwo.size())
		{
			for (int k: listOne) 
			{
				oneAndTwo.add();
			}
		}
		return oneAndTwo;
	}

}
*/