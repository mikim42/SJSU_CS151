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
		menuListPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		menuDetailPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		toolBarPanel = new JPanel();	
		
		/*
		** menuDetail Panel
		*/
		menuDetailPanel.setPreferredSize(new Dimension(350, 500));
		
		JLabel nameLabel = new JLabel("Item Name:");
		JLabel priceLabel = new JLabel("Item Price:");
		JTextField itemName = new JTextField();
		JTextField itemPrice = new JTextField();
		JButton applyButton = new JButton("Apply");
		GridBagConstraints detailGBC = new GridBagConstraints();
		
		itemName.setPreferredSize(new Dimension(200, 50));
		itemPrice.setPreferredSize(new Dimension(200, 50));
		applyButton.setPreferredSize(new Dimension(150, 20));
		
		menuDetailPanel.setLayout(new GridBagLayout());
		detailGBC.gridx = 0;
		detailGBC.gridy = 0;
		menuDetailPanel.add(nameLabel, detailGBC);
		detailGBC.gridx = 1;
		detailGBC.gridy = 0;
		menuDetailPanel.add(itemName, detailGBC);
		detailGBC.gridx = 0;
		detailGBC.gridy = 1;
		menuDetailPanel.add(priceLabel, detailGBC);
		detailGBC.gridx = 1;
		detailGBC.gridy = 1;
		menuDetailPanel.add(itemPrice, detailGBC);
		detailGBC.gridx = 1;
		detailGBC.gridy = 2;
		menuDetailPanel.add(applyButton, detailGBC);
		
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
		
		/*
		** menuListPanel
		
		menuListPanel.setPreferredSize(new Dimension(250, 500));
		menuListPanel.setBackground(Color.white);
		menuListPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// Parse Items here
		String itemList[] = {"item 1", "item 2", "item 3"};
		JList menuList = new JList(itemList);
		//
		menuList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				itemName.setText((String)menuList.getSelectedValue());
				itemPrice.setText("3.99");
			}
		});
		menuListPanel.add(menuList);
		*/
	}
	
}
