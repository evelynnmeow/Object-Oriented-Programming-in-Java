package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		// size of the window or canvas
		size(400, 400);
		// change the background color
		// 0, 0, 0 is black
		background(0, 0, 0);
	}
	
	public void draw() {
		// draw a happy face
		// fill the color of the circle
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		// eyes
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		ellipse(280, 130, 50, 70);
		
		noFill();
		arc(200, 280, 75, 75, 0, PI);
	}
	

}
