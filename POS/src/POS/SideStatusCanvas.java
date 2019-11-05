package POS;
import java.awt.*;

import javax.swing.*;
public class SideStatusCanvas extends JPanel{
	private JPanel checkoutPanel;
	public SideStatusCanvas(ShoppingCart cart) {
		this.setPreferredSize(new Dimension(250,600));
		this.setBackground(Color.orange);
		this.setLayout(new BorderLayout());
		
		checkoutPanel = new JPanel();
		checkoutPanel.setPreferredSize(new Dimension(250,40));
		checkoutPanel.setLayout(new BorderLayout());
		
		JButton checkoutbutton = new JButton("Checkout");
		checkoutbutton.setPreferredSize(new Dimension(250,30));
		checkoutPanel.add(checkoutbutton, BorderLayout.CENTER);
		
		this.add(checkoutPanel, BorderLayout.SOUTH);
		}
}
