package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List
    	List<String> newStringArrayList = new ArrayList<>();
    	
    	// Step Two: Add values to a List
    	newStringArrayList.add("Joshua");
    	newStringArrayList.add("Brooke");
    	newStringArrayList.add("Mason");
    	newStringArrayList.add("Aza");
    	newStringArrayList.add("Julie");
    	newStringArrayList.add("Suckers");
    	
    	// Step Three: Looping through a List in a for loop
    	for (int i = 0; i < newStringArrayList.size(); i++) {
    		System.out.println(newStringArrayList.get(i));
    	}
    	newStringArrayList.add("JOKER");
    	// Step Four: Remove an item
    	
    	for (int i = 0; i < newStringArrayList.size(); i++) {
    		System.out.println(newStringArrayList.get(i));
    	}
   
    	
    	// Step Five: Looping through List in a for-each loop
    	for (String string : newStringArrayList) {
    	
    			System.out.println(string);
    		
    		
		}

    }

}
