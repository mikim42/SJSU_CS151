package POS;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
public class SideStatusCanvas extends JPanel{
	private ShoppingCart cart;
	private JPanel checkoutPanel;
	private JPanel cartPanel;
	Box box = Box.createVerticalBox();

	ArrayList<JButton> buttons = new ArrayList<>();

	public SideStatusCanvas(ShoppingCart cart) {
		this.setPreferredSize(new Dimension(250,600));
		this.setBackground(Color.orange);
		this.setLayout(new BorderLayout());
		this.cart = cart;
		checkoutPanel = new JPanel();
		checkoutPanel.setPreferredSize(new Dimension(250,40));
		checkoutPanel.setLayout(new BorderLayout());
		
		JButton checkoutbutton = new JButton("Checkout");
		checkoutbutton.setPreferredSize(new Dimension(250,30));
		checkoutPanel.add(checkoutbutton, BorderLayout.CENTER);
		
		this.add(checkoutPanel, BorderLayout.SOUTH);
		
		cartPanel = new JPanel();
		cartPanel.setPreferredSize(new Dimension(250, 950));
		cartPanel.setBackground(Color.white);
		this.add(cartPanel, BorderLayout.NORTH);
		
	}
	 public void addItem() {
		if (cart.getItems().size()!=0){
		Dimension buttonSize = new Dimension(200,100);

		System.out.println(cart.getItems());
		Item item = this.cart.getLastItem();
		JButton button = new JButton(item.getQuantity()+"x  "+ item.getName() + "   " + "$"+item.getQuantity()*item.getPrice()+"\n"+item.getNote());
		button.setPreferredSize(buttonSize);
		box.add(button);
		cartPanel.add(box);
		this.revalidate();
		this.repaint();
		}
		}
}
		
	
	

