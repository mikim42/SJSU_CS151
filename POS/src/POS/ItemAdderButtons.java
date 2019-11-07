package POS;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class ItemAdderButtons {
	private Item item;
	private ItemAdderPanel panel;
	public ItemAdderButtons(Item item, ShoppingCart cart) {
		JButton add = new JButton("Add");
		JButton cancel = new JButton("Cancel");
		Dimension buttonSize = new Dimension(100,30);
		panel = new ItemAdderPanel(item);
		add.setPreferredSize(buttonSize);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		cancel.setPreferredSize(buttonSize);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		});
		JPanel buttons = new JPanel();
		buttons.add(add);
		buttons.add(cancel);
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
		panel.add(buttons, BorderLayout.SOUTH);
		panel.add(editor, BorderLayout.CENTER);
		panel.pack();
		panel.setVisible(true);
	}
}
