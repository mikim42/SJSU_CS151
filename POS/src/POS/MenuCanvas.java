package POS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MenuCanvas extends JPanel{
	private MenuItems Items;
	
	public MenuCanvas(ShoppingCart cart) {
		Dimension menuButtonSize = new Dimension(150,70);
		this.setPreferredSize(new Dimension(750,300)) ;
		this.setBackground(Color.blue);
		this.setLayout(new BorderLayout());
		
		JPanel menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(750,270));
		menuPanel.setBackground(Color.blue);
		this.add(menuPanel, BorderLayout.CENTER);
		
		JPanel navpanel = new JPanel();
		navpanel.setPreferredSize(new Dimension(750,30));
		this.add(navpanel, BorderLayout.NORTH);

		JButton editMenu = new JButton ("EDIT MENU");
		editMenu.setPreferredSize(new Dimension(150,20));
		navpanel.setLayout(new BorderLayout());
		navpanel.add(editMenu, BorderLayout.WEST);
		
		JButton pastrami = new JButton("Pastrami");
		pastrami.setPreferredSize(menuButtonSize);
		menuPanel.add(pastrami);
		Item pastramii = new Item("pastrami", 2.99);
		Items = new MenuItems();
		Items.addItem(pastramii);
		Items.updateDB();
		SideStatusCanvas sideStatusCanvas = new SideStatusCanvas(cart);
		this.add(sideStatusCanvas, BorderLayout.EAST);
		editMenu.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				MenuCanvasEditor Editor = new MenuCanvasEditor(Items);
			}
		});
		pastrami.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItemAdderPanel panel1 = new ItemAdderPanel(sideStatusCanvas, pastramii, cart);
				panel1.pack();
				panel1.setVisible(true);
			}
		});
		
	}
}
