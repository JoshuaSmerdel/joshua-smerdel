package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.events.Namespace;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		// list comparable to an array.  
		// list are 0 based like and array
		
		int[] numbersArray = new int[5];
		List<Integer> numbersList = new ArrayList<>();
		
		
		List<String> names = new ArrayList<String>();
		
		names.add("Wolverine");
		names.add("Iron Man");
		names.add("Black Panther");
		names.add("Captain America");
		names.add("Deadpool");
		
		names.get(0);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println(names);

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Wolverine");

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(3, "Hulk");
		

		for (int i = 0; i < names.size(); i++)
			{
				System.out.println(names.get(i));
			}


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		names.remove("Wolverine");
		
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean hasWolverine = names.contains("Wolverine");
		System.out.println(hasWolverine);

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		int whereIs = names.indexOf("Wolverine");
		
		System.out.println(whereIs);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesArray = names.toArray(new String[0]);
		
		String[] namesArray2 = names.toArray(new String[names.size()]);
		
		for (int i = 0; i < namesArray.length; i++)
		{
			System.out.println(namesArray[i]);
		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		
		Collections.sort(names);
		
		names.sort(null);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		
		Collections.reverse(names);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		for (String name: names) {
			System.out.println(name);
		}


	}
}
