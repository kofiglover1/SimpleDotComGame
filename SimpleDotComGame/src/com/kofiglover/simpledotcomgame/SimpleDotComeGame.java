package com.kofiglover.simpledotcomgame;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleDotComeGame {

	public static void main(String[] args) {
		int numberOfGuesses = 0;
		boolean isAlive = true;
		
		
	//creating location for dot com site on 7 cell grid (0-6)
	SimpleDotCom dot = new SimpleDotCom();
	
	//creating 3 random numbers for location of dotcom, One id between 0-4, other two sequencing it
	int ran1 = (int) (Math.random()*5);
	//Puting them into an array
	int[] randomNums = {ran1, ran1+1, ran1+2};
	
	dot.setLocationnCells(randomNums);
	//starting game to ask user for their guesses
	while(isAlive == true){
		GameHelper helper = new GameHelper();
		String stringGuess = helper.getUserInput("Whats your guess?");
		String result = dot.checkYourself(stringGuess);
		numberOfGuesses++;
		if(result == "kill"){
			isAlive = false;
			System.out.println("You took " + numberOfGuesses + " guesses" );
		}//end if
		
	}//end while
	
	
	
			
		}

	

	}


