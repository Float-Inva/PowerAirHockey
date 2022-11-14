package com.example.a2dproject_powerairhockey;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
public class Paddle extends Sprite {
	
	private int dx;
	private int dy;
	
	public Paddle() {
		initPaddle();
	}
	
	private void initPaddle() {
		loadImage();
		getImageDimensions();
		 
		resetState();
		
	}
	
	private void loadImage() {
		
		var ii = new ImageIcon("src/main/java/com/example/resources/puck2.png");
		image = ii.getImage();
		
	}
	
	void move() {
		x += dx;
		y += dy;
		
		if (x <= 0) {
			x = 0;
			
		}

		if (y <= 0) {
			y = 0;

		}
		
	if (x >= Commons.WIDTH - imageWidth) {
		x = Commons.WIDTH - imageWidth;
		
	}

	if (y >= Commons.HEIGHT - imageHeight) {
		y = Commons.HEIGHT - imageHeight;

		}
		
	}
	
	void keyPressed(KeyEvent e) {	// movement of board
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			
			dx = -3;
		}
		
		if (key == KeyEvent.VK_RIGHT) {
			
			dx = 3;
		}

		if (key == KeyEvent.VK_UP) {

			dy = -3;
		}

		if (key == KeyEvent.VK_DOWN) {

			dy = +3;
		}
		
		
	}
	
	
	void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			
			dx = 0;
		}
		
		if (key == KeyEvent.VK_RIGHT) {
			
			dx = 0;
		}
		if (key == KeyEvent.VK_UP) {

			dy = 0;
		}

		if (key == KeyEvent.VK_DOWN) {

			dy = 0;
		}
		
	
		
	}
	
	
	private void resetState() {
		
		x = Commons.INIT_PADDLE_X;
		y = Commons.INIT_PADDLE_Y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
