package POS;

import javax.swing.*;
import java.awt.*;

public class MenuCanvasEditor extends JFrame{
		JPanel menuListPanel;
		JPanel menuDetailPanel;
		JPanel toolBarPanel;
	
	public MenuCanvasEditor(MenuItems Items) {
		menuListPanel = new JPanel();
		menuDetailPanel = new JPanel();
		toolBarPanel = new JPanel();
		
		getEditmenuPanel();
		
		this.setTitle("Edit Menu");
		this.add(menuListPanel, BorderLayout.WEST);
		this.add(menuDetailPanel, BorderLayout.EAST);
		this.add(toolBarPanel, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}
	
	private void getEditmenuPanel() {
		menuListPanel = new JPanel();
		menuDetailPanel = new JPanel();
		toolBarPanel = new JPanel();
		
		/*
		** menuListPanel
		*/
		menuListPanel.setPreferredSize(new Dimension(250, 500));
		menuListPanel.setBackground(Color.white);
		
		String test[] = {"item 1", "item 2", "item 3"};
		JList menuList = new JList(test);
		
		menuListPanel.add(menuList);
		
		/*
		** menuDetail Panel
		*/
		menuDetailPanel.setPreferredSize(new Dimension(250, 500));
		
		JLabel nameLabel = new JLabel("Item Name:");
		JLabel priceLabel = new JLabel("Item Price:");
		JTextField itemName = new JTextField();
		JTextField itemPrice = new JTextField();
		JButton applyButton = new JButton("Apply");
		
		itemName.setPreferredSize(new Dimension(200, 50));
		itemPrice.setPreferredSize(new Dimension(200, 50));
		
		applyButton.setPreferredSize(new Dimension(150, 20));
		
		menuDetailPanel.add(nameLabel);
		menuDetailPanel.add(itemName);
		menuDetailPanel.add(priceLabel);
		menuDetailPanel.add(itemPrice);
		menuDetailPanel.add(applyButton);
		/*
		** toolBarPanel
		*/
		JButton addButton = new JButton("Add");
		JButton delButton = new JButton("Delete");
		JButton closeButton = new JButton("Close");
		
		addButton.setPreferredSize(new Dimension(150, 20));
		delButton.setPreferredSize(new Dimension(150, 20));
		closeButton.setPreferredSize(new Dimension(150, 20));
		
		toolBarPanel.setBackground(Color.gray);
		toolBarPanel.add(addButton);
		toolBarPanel.add(delButton);
		toolBarPanel.add(closeButton);
	}
}
