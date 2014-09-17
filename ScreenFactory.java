package com.RadialSoftworks.www;

public class ScreenFactory {

	private final Main game;
	private Screen screen;
	
	public ScreenFactory(Main game) {
	
		this.game = game;
		
	}
	
	public void showScreen(Screen screen) {
		
		this.screen = screen;
		screen.onCreate();
		
	}
	
	public Screen getCurrentScreen() {
		return screen;
	}
	
}
