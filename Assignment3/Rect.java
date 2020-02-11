package MVC;

import java.awt.*;

public class Rect extends Shape {
	public Rect(int x, int y, int w, int h, boolean f) {
		super(x, y, w, h, f);
	}
	
	public void draw(Graphics g) {
		if (getFill())
			g.fillRect(getX() - getWidth() / 2, getY() - getHeight() / 2, getWidth(),
			getHeight());
		else
			g.drawRect(getX() - getWidth() / 2, getY() - getHeight() / 2, getWidth(),
			getHeight());
	}
}