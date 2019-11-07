package POS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemAdderPanel extends JFrame{
	private Item item;
	public ItemAdderPanel(Item item) {
		this.item = item;
		this.setTitle("Adding " + item.getName());		

	}
}
