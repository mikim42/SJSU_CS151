package MVC;

import java.awt.*;

public class Square extends Rect {
	public Square(int x, int y, int w, int h, boolean f) {
		super(x, y, w, h, f);
	}
	
	public void ddraw(Graphics g) {
		if (getFill())
			g.fillRect(getX() - getWidth() / 2, getY() - getHeight() / 2,
			getWidth(), getHeight());
		else
			g.drawRect(getX() - getWidth() / 2, getY() - getHeight() / 2,
			getWidth(), getHeight());
	}
}