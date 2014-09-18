package com.RadialSoftworks.www;

	// The engine is run from this class

public class TheGame {
	
	private Main game;
	
	public TheGame() {
		
		game = new Main(800, 600, "Radial Engine");
		game.getScreenFactory().showScreen(new TheScreen(game.getScreenFactory()));
		
	}

	public static void main(String[] args) {
		new TheGame();
	}
	
}
