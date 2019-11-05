package MVC;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingFrame extends JFrame {
	private CanvasEditor canvasEditor;
	private DrawingCanvas drawingCanvas;
	private JTextField statusTextField;
	private boolean fill;

	public DrawingFrame() {
		drawingCanvas = new DrawingCanvas();
		JPanel toolBarPanel = getToolStatusPanel();
		
		this.setTitle("Drawing Application");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(drawingCanvas, BorderLayout.CENTER);
		this.add(toolBarPanel, BorderLayout.SOUTH);
	}
	
	private JPanel getToolStatusPanel() {
		JPanel toolBarPanel = new JPanel();
		JPanel toolStatusPanel = new JPanel();
		JPanel radioPanel = new JPanel();
		JRadioButton emptyButton = new JRadioButton("Empty", true);
		JRadioButton filledButton = new JRadioButton("Filled", false);
		ButtonGroup bg = new ButtonGroup();
		
		emptyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fill = false;
				canvasEditor.setCurrentFill(fill);
			}
		});
		filledButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fill = true;
				canvasEditor.setCurrentFill(fill);
			}
		});
		bg.add(emptyButton);
		bg.add(filledButton);
		radioPanel.add(emptyButton);
		radioPanel.add(filledButton);
		statusTextField = new JTextField(30);
		statusTextField.setPreferredSize(new Dimension(40, 30));
		statusTextField.setText("Please Select Shape");
		
		toolStatusPanel.setLayout(new BorderLayout());
		toolStatusPanel.add(radioPanel, BorderLayout.NORTH);
		toolStatusPanel.add(toolBarPanel, BorderLayout.CENTER);
		toolStatusPanel.add(statusTextField, BorderLayout.SOUTH);
		
		Dimension buttonSize = new Dimension(120, 40);
		JButton ellipse = new JButton("Ellipse");
		JButton circle = new JButton("Circle");
		JButton rect = new JButton("Rectangle");
		JButton square = new JButton("Square");
		JButton clear = new JButton("Clear");
		canvasEditor = new CanvasEditor(null, statusTextField);
		
		toolBarPanel.add(clear);
		toolBarPanel.add(ellipse);
		toolBarPanel.add(circle);
		toolBarPanel.add(rect);
		toolBarPanel.add(square);
		
		clear.setPreferredSize(buttonSize);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawingCanvas.clearShapes();
				canvasEditor.setCurrentShape(null, null);
				statusTextField.setText("Canvas Cleared");
			}
		});
		
		ellipse.setPreferredSize(buttonSize);
		ellipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasEditor.setCurrentShape(new Ellipse(0, 0, 120, 60, fill),
				new JTextField("Ellipse"));
				statusTextField.setText("Ellipse Selected");
			}
		});
		
		circle.setPreferredSize(buttonSize);
		circle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasEditor.setCurrentShape(new Circle(0, 0, 90, 90, fill),
				new JTextField("Circle"));
				statusTextField.setText("Circle Selected");
			}
		});
		
		rect.setPreferredSize(buttonSize);
		rect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasEditor.setCurrentShape(new Rect(0, 0, 120, 60, fill),
				new JTextField("Rectangle"));
				statusTextField.setText("Rectangle Selected");
			}
		});
		
		square.setPreferredSize(buttonSize);
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasEditor.setCurrentShape(new Square(0, 0, 90, 90, fill),
				new JTextField("Square"));
				statusTextField.setText("Square Selected");
			}
		});
		
		try {
		drawingCanvas.addMouseListener(canvasEditor);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return toolStatusPanel;
	}
}