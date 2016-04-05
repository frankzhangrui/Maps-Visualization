package guimodule;
import processing.core.*;
public class MyDisplay extends PApplet {
	PImage img;
	public void setup() {
		size(400,400,OPENGL);
		background(255);
		stroke(0);
		img = loadImage("https://usercontent1.hubstatic.com/3832584_f260.jpg", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}
	
	public void draw() {
		
	}
}
