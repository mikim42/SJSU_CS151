package POS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
public class SideStatusCanvas extends JPanel{
	private static ShoppingCart cart;
	private JPanel checkoutPanel;
	private JPanel cartPanel;
	private JPanel checkOutBox;
	private static double total;

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
		
		checkoutbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPanel Editor = new CheckoutPanel();
				Editor.pack();
				Editor.setVisible(true);
			}
		});
		
	}
	
	public void addItem() {
		
		SideStatusCanvas s = this;
		if (cart.getItems().size()!=0){
		Dimension buttonSize = new Dimension(240,100);

		System.out.println(cart.getItems());
		Item item = this.cart.getLastItem();
		
		JButton button = new JButton();
		button.setLayout(new BorderLayout());
		JLabel des = new JLabel(item.getQuantity()+"x  "+ item.getName() + "   " + "$"+item.getQuantity()*item.getPrice());
		//total += item.getQuantity() * item.getPrice();
		JLabel note = new JLabel((item.getNote()));
		button.add(des, BorderLayout.NORTH);
		button.add(note, BorderLayout.AFTER_LAST_LINE);
		button.setMinimumSize(buttonSize);
		button.setMargin(new Insets(10,10,10,10));
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				EditAddedItemFrame f = new EditAddedItemFrame(item, cart, s, button, cartPanel);
				f.pack();
				f.setVisible(true);
			}
			
		});
		cartPanel.add(button);
		this.revalidate();
		this.repaint();
		}
		}
	
	public static double getTotal() {
		total = 0;
		for (Item itemexample:cart.getCart()) {
			System.out.println(itemexample.getName()+"  "+itemexample.getId()+ " " +itemexample.getQuantity());

			total+=(itemexample.getPrice() * itemexample.getQuantity());
			
		}
		System.out.println("-----------------------");
		return  total;
		
	}
}
		
	
	

