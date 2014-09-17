package com.RadialSoftworks.www;

import javax.swing.JFrame;

public class Main {
	
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	
	public Main(int windowX, int windowY, String title) {
		
		window.setSize(windowX, windowY);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setLocationRelativeTo(null);
		window.setTitle(title);
		window.setVisible(true);
		screenFactory = new ScreenFactory(this);
		
	}
	
	public ScreenFactory getScreenFactory() {
		return screenFactory;
	}
	
	public JFrame getWindow() {
		return window;
	}


}
