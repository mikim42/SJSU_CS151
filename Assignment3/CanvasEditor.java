package MVC;

import java.awt.event.*;
import javax.swing.*;

public class CanvasEditor implements MouseListener {
	private Shape currentShape;
	private JTextField statusText;
	
	public CanvasEditor(Shape initialShape) {
		this.currentShape = initialShape;
	}
	
	public CanvasEditor(Shape initialShape, JTextField textfield) {
		this.currentShape = initialShape;
		this.statusText = textfield;
	}
	
	public void setCurrentShape(Shape newShape, JTextField textfield) {
		this.currentShape = newShape;
		this.statusText = textfield;
	}
	
	public void setCurrentFill(boolean f) {
		this.currentShape.setFill(f);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (currentShape == null) {
			statusText.setText("Please Select Shape");
			return;
		}
		Shape newShape = (Shape)currentShape.clone();

		newShape.setCenter(e.getX(), e.getY());
		DrawingCanvas drawingCanvas = (DrawingCanvas)e.getSource();
		drawingCanvas.addShape(newShape);
		statusText.setText(currentShape.getClass().getName() + " Drawn");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
}