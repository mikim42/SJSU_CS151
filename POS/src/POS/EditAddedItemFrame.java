package POS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EditAddedItemFrame extends JFrame{
	private Item item;
	private ShoppingCart cart;
	private SideStatusCanvas s;
	private JButton buttonChosen;
	private JPanel cartPanel;
	public EditAddedItemFrame(Item item, ShoppingCart cart, SideStatusCanvas s, JButton buttonChosen, JPanel cartPanel) {
		this.item = item;
		this.cart = cart;
		this.s = s;
		this.cartPanel = cartPanel;
		this.buttonChosen = buttonChosen;
		this.setPreferredSize(new Dimension(500,300));
		this.setTitle("Edit " + item.getName());
		this.add(getPanel());
		}
	public JPanel getPanel() {
		EditAddedItemFrame p = this;
		JPanel panel = new JPanel();
		JPanel qpanel = new JPanel();
		JPanel notepanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		panel.setPreferredSize(new Dimension(500,300));
		qpanel.setPreferredSize(new Dimension(100,50));
		notepanel.setPreferredSize(new Dimension(300,200));
		buttonPanel.setPreferredSize(new Dimension(100,50));
		qpanel.setBackground(Color.YELLOW);
		notepanel.setBackground(Color.BLACK);
		buttonPanel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		
		
		JButton update = new JButton("Update");
		JButton cancel = new JButton("Cancel");
		buttonPanel.add(update);
		buttonPanel.add(cancel);
		
		JTextField quantity = new JTextField();
		quantity.setText(Integer.toString(item.getQuantity()));
		quantity.setPreferredSize(new Dimension(80,30));
		quantity.setHorizontalAlignment(JTextField.CENTER);
		
		JButton qDecrease = new JButton("-");
		qDecrease.setPreferredSize(new Dimension(50,30));
		JButton qIncrease = new JButton("+");
		qIncrease.setPreferredSize(new Dimension(50,30));
		
		qIncrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = Integer.valueOf((quantity.getText()));
				count +=1;
				quantity.setText(String.valueOf(count));
			}
		});
		qDecrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = Integer.valueOf((quantity.getText()));
				if (count>1) {
					count -=1;	
				}
				else {
					count = 0;
				}
				quantity.setText(String.valueOf(count));
			}
		});
		
		update.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int value = (Integer.valueOf(quantity.getText()));
				item.setQuantity(value);
				cartPanel.remove(buttonChosen);
				//box.remove(buttonChosen);
				JButton button = new JButton();
				button.setLayout(new BorderLayout());
				JLabel des = new JLabel(item.getQuantity()+"x  "+ item.getName() + "   " + "$"+item.getQuantity()*item.getPrice());
				double total =0;
				total += item.getQuantity() * item.getPrice();
				JLabel note = new JLabel((item.getNote()));
				button.add(des, BorderLayout.NORTH);
				button.add(note, BorderLayout.AFTER_LAST_LINE);
				button.setMinimumSize(new Dimension(240,100));
				button.setMargin(new Insets(10,10,10,10));
				button.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						EditAddedItemFrame f = new EditAddedItemFrame(item, cart, s, button, cartPanel);
						f.pack();
						f.setVisible(true);
					}
					
				});
				cartPanel.add(button);
				cart.updateItem(item);
				p.dispose();
				s.revalidate();
				s.repaint();
			}
			
		});
		
		qpanel.add(qDecrease);
		qpanel.add(quantity);
		qpanel.add(qIncrease);
		panel.add(qpanel, BorderLayout.NORTH);
		panel.add(notepanel, BorderLayout.CENTER);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		return panel;
	}
}
