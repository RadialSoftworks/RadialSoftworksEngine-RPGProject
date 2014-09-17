package com.RadialSoftworks.www;

import java.awt.Color;
import java.awt.Graphics2D;

public class TheScreen extends Screen {
	
	private int x = 0;

	public TheScreen(ScreenFactory screenFactory) {
		super(screenFactory);
		
	}

	@Override
	public void onCreate() {
		
		
	}

	@Override
	public void onUpdate() {
		
		if (x >= 800 + 64)
			
			x = -64;
			
			x++;
		
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		
		g2d.fillRect(x, 300, 64, 64);
		g2d.setColor(Color.black);
		
	}

	
	
}
