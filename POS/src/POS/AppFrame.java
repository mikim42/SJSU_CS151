package POS;

import java.awt.*;

import javax.swing.*;

public class AppFrame extends JFrame{
	private MenuCanvas menuCanvas;
	private SideStatusCanvas sideStatusCanvas;
	private ShoppingCart cart;
	public AppFrame() {		
		cart = new ShoppingCart();
		this.setTitle("POBest");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		menuCanvas = new MenuCanvas(cart);
		sideStatusCanvas = new SideStatusCanvas(cart);
		this.add(menuCanvas, BorderLayout.CENTER);
		this.add(sideStatusCanvas, BorderLayout.EAST);
		
		}
}
