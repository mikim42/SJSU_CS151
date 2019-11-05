package MVC;

import java.awt.*;

public class Ellipse extends Shape {
	public Ellipse(int x, int y, int w, int h, boolean f) {
		super(x, y, w, h, f);
	}
	
	public void draw(Graphics g) {
		if (getFill())
			g.fillOval(getX() - getWidth() / 2, getY() - getHeight() / 2,
			getWidth(), getHeight());
		else
			g.drawOval(getX() - getWidth() / 2, getY() - getHeight() / 2,
			getWidth(), getHeight());
	}
}