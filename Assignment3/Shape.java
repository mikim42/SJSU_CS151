package MVC;

import java.awt.*;

public abstract class Shape implements Cloneable {
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean fill;
	
	public Shape(int x, int y, int w, int h, boolean f) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.fill = f;
	}
	
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	public int getWidth() {return this.width;}
	public int getHeight() {return this.height;}
	public boolean getFill() {return this.fill;}
	
	public void setFill(boolean f) {this.fill = f;}
	
	public void setCenter(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw(Graphics g);
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
}