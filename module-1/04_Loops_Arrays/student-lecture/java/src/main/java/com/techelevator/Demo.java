package com.techelevator;

public class Demo {
	

	public static void main(String[] args) {
	
	
	}
	
	public static void introToArrays() {
		

//		int score1 = 99;
//		int score2 = 87;
//		int score3 = 92;
//		
//		int averageScore = (score1 + score2 + score3) /3;
		
		int[] scores;
		scores = new int[3];
		
		scores[0] = 99;
		scores[1] = 87;
		scores[2] = 92;
		
		System.out.println(scores[1]);
		
		System.out.println(scores.length);
		
		for ( int index = 0; index < scores.length; index++) {
			System.out.println(scores[index]);
		}
	
	
	}
	public static void whileLoops()
{
		
		int counter = 0;
		
		while (counter < 5) {
			System.out.println(counter);
			
//			counter = counter + 1;
//			counter += 1;
			counter ++;
		}
		System.out.println("end of program");
	}
}