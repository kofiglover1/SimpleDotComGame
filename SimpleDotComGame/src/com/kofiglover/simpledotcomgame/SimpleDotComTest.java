package com.kofiglover.simpledotcomgame;

public class SimpleDotComTest {

	public static void main(String[] args) {
		int location[] = {1,2,3};
		
		SimpleDotCom dot = new SimpleDotCom();
		dot.setLocationnCells(location);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
	}

}
