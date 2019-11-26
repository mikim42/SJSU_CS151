package POS;

import javax.swing.*;
import java.util.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class CheckoutPanel extends JFrame{
		
	private JPanel toolbarPanel;	
	private JTextArea TextField;
		Dimension menuButtonSize = new Dimension(90, 35);
	
	
	public CheckoutPanel() {
		
		
		getCheckoutPanel();
		
		this.setTitle("Checkout Page");
		this.pack();
		this.setVisible(true);
		this.setPreferredSize(new Dimension(500,500));
		
		this.add(toolbarPanel, BorderLayout.SOUTH);
	
	}
	
	private void getCheckoutPanel() {
		
		CheckoutPanel currWindow = this;
		toolbarPanel = new JPanel();
		toolbarPanel.setPreferredSize(new Dimension(500,40));
		
		currWindow.setPreferredSize(new Dimension(500,500));
		currWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currWindow.setLocation(100,100);
	
		double total = SideStatusCanvas.getTotal();
		
		double tax1 = total * 0.08;
		BigDecimal bd = new BigDecimal(tax1);
		bd = bd.round(new MathContext(4));
		double tax = bd.doubleValue();
		
		double tips1 = total * 0.2;
		BigDecimal bd2 = new BigDecimal(tips1);
		bd2 = bd2.round(new MathContext(4));
		double tips = bd2.doubleValue();
		
		double final1 = total + tax + tips;
		BigDecimal bd3 = new BigDecimal(final1);
		bd3 = bd3.round(new MathContext(4));
		double finall = bd3.doubleValue();
		
		TextField = new JTextArea("\n\n\n\n   Your Total is: $"+ total + "\n   Tax(8%): $" + tax + "\n   Tips(20%): $" + tips + 
				"\n---------------------------------------------------------------\n    Final: $" + finall);

		TextField.setBounds(5, 5, 10, 20);
        currWindow.add(TextField);
        TextField.setBackground(new Color(102,171,205));
        TextField.setText(TextField.getText() + "\n \n \n \n \n  Please Choose A Payment Method Below: \n\n\n");
        
        JButton cash = new JButton("Cash");
        cash.setPreferredSize(menuButtonSize);
        JButton card = new JButton("Credit Card");
        card.setPreferredSize(menuButtonSize);
        JButton close = new JButton("Close");
        close.setPreferredSize(menuButtonSize);
        
        
        toolbarPanel.add(cash);
        toolbarPanel.add(card);
        toolbarPanel.add(close);
        
        cash.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	TextField.setText(TextField.getText() + "\n\n\nThank you for stopping by! See you again soon!");
        	}
       
        });
        
        card.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	TextField.setText(TextField.getText() + "\n\n\n\nThank you for stopping by! See you again soon!");
        	}
       
        });
       /* bitcoin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	TextField.setText(TextField.getText() + "\n\n\n\nThank you for stopping by! See you again soon!");
        	}
       
        });  */
        
           close.addActionListener(new ActionListener() {
        	   
        	   public void actionPerformed(ActionEvent e) {
        		   
        		   currWindow.dispose();
        	   }
           });
        
		
	}
}