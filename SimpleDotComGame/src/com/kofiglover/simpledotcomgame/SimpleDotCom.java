package com.kofiglover.simpledotcomgame;

import java.util.Arrays;

public class SimpleDotCom {
	
//what it knows
	private int[] locationCells;
	private int numberOfHits;

	
	//what it does
	
	//getters and setters
	public int[] getLocationCells(){
		
		return locationCells;
	}
	
	public void setLocationnCells(int[] locs){
		
		locationCells = locs;
	}
	//checks if it has been missed, hit or killed(hit 3 times)
	public String checkYourself(String stringGuess){
		
	int guess = Integer.parseInt(stringGuess);
	String result = "miss";
	
	for(int cell: locationCells){
		if(guess == cell){
			result = "hit";
			
			numberOfHits++;
			break;
		}
	}
	
	if(numberOfHits == locationCells.length){
		
		result = "kill";
	}
	
	System.out.println(result);
	
	return result;
	}//end of method

	@Override
	public String toString() {
		return "SimpleDotCom [locationCells=" + Arrays.toString(locationCells) + ", numberOfHits=" + numberOfHits + "]";
	}

	
	
}
