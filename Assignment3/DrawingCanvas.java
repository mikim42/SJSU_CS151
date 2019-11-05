package MVC;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class DrawingCanvas extends JPanel {
	private ShapeModel shapeModel;

	public DrawingCanvas() {
		this.setPreferredSize(new Dimension(800, 600));
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setBackground(new Color(0x66ccff));
		shapeModel = new ShapeModel();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Iterator<Shape> it = shapeModel.iterator();
		while (it.hasNext()) {
			Shape shape = (Shape)it.next();
			shape.draw(g);
		}
	}
	
	public void addShape(Shape newShape) {
		shapeModel.addShape(newShape);
		repaint();
	}
	
	public void clearShapes() {
		Iterator it = shapeModel.iterator();
		
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		repaint();
	}
}