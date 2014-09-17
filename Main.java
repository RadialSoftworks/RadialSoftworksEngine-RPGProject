package com.RadialSoftworks.www;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Main {
	
	// Class/Program Variables
	
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
	private final KeyboardListener keyboardListener;
	private final MousePadListener mousepadListener;
	
	
	public Main(int windowX, int windowY, String title) {
		
		// Settings
		
		window.setSize(windowX, windowY);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setLocationRelativeTo(null);
		window.setTitle(title);
		window.setVisible(true);
		screenFactory = new ScreenFactory(this);
		gameThread = new GameThread(this);
		keyboardListener = new KeyboardListener();
		mousepadListener = new MousePadListener();
		
		// Adding Components
		
		window.add(gameThread);
		window.addKeyListener(keyboardListener);
		window.addMouseListener(mousepadListener);
		
		// Running the thread
		
		new Thread(gameThread).start();
		
	}
	
	public MouseListener getMouseListener() {
		return mousepadListener;
	}
	
	public KeyListener getKeyboardListener() {
		return keyboardListener;
	}
	
	public ScreenFactory getScreenFactory() {
		return screenFactory;
	}
	
	public JFrame getWindow() {
		return window;
	}


}
