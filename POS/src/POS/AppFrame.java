package POS;

import java.awt.*;

import javax.swing.*;

public class AppFrame extends JFrame{
	private MenuCanvas menuCanvas;
	
	public AppFrame(ShoppingCart cart) {
		this.setTitle("POBest");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		menuCanvas = new MenuCanvas(cart);
		this.add(menuCanvas, BorderLayout.CENTER);
	}
}
