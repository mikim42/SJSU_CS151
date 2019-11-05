package POS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemAdderPanel extends JFrame{
	private Item item;
	public ItemAdderPanel(Item item, ShoppingCart Cart) {
		this.item = item;
		this.setTitle("Adding " + item.getName());
		
		JButton add = new JButton("Add");
		JButton cancel = new JButton("Cancel");
		Dimension buttonSize = new Dimension(100,30);
		
		add.setPreferredSize(buttonSize);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		cancel.setPreferredSize(buttonSize);
		
		JPanel buttons = new JPanel();
		buttons.add(add);
		buttons.add(cancel);
		this.add(buttons, BorderLayout.SOUTH);
		
		JPanel editor = new JPanel();
		editor.setBackground(Color.red);
		editor.setPreferredSize(new Dimension(400,300));
		JButton qDecrease = new JButton("-");
		editor.add(qDecrease);
		JTextField quantity = new JTextField();
		quantity.setText(item.getQuantity()+"");
		editor.add(quantity);
		JButton qIncrease = new JButton("+");
		editor.add(qIncrease);
		this.add(editor, BorderLayout.CENTER);
		
		
		
		

	}
}
