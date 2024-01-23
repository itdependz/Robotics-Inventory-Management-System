package com.samarth;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Desktop;
import java.util.*;

public class ProductView {
	
	private JFrame frame;
	private JTextField quantityTextField;
	//public ArrayList<Product> productList = new ArrayList<Product>();
	
	public ProductView(addList list, Product product, String teamNumber) {
		initialize(list, product, teamNumber);
	}
	
	private void initialize(addList list, Product product, String teamNumber) {
		frame = new JFrame();
		frame.setTitle("Robotics Inventory Management System");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		
		
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel title = new JLabel(product.getName());
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Sans-serif", Font.BOLD, 36));
		title.setAlignmentX(0);
		title.setAlignmentY(0);
		
		panel.add(title);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel quanitityLabel = new JLabel("Quantity: " + product.getQuantity());
		quanitityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quanitityLabel.setBounds(181, 35, 186, 85);
		panel_1.add(quanitityLabel);
		
		quantityTextField = new JTextField();
		quantityTextField.setBounds(377, 67, 96, 20);
		panel_1.add(quantityTextField);
		quantityTextField.setColumns(10);
		
		JButton changeQuantity = new JButton("Update");
		changeQuantity.setBounds(516, 66, 89, 23);
		changeQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.updateQuantity(Integer.parseInt(quantityTextField.getText()));
				quanitityLabel.setText("Quantity: " + product.getQuantity());
			}
		});
		panel_1.add(changeQuantity);
		
		JButton back = new JButton("Back");
		back.setBounds(361, 324, 126, 44);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewFrame view = new ViewFrame(list, teamNumber);
				view.show();
				}
			});
		panel_1.add(back);
		
		JButton purchaseButton = new JButton("Purchase");
		purchaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL(product.getLink()).toURI());
				}
				catch(Exception e1){}
			}
		});
		purchaseButton.setBounds(377, 249, 96, 44);
		panel_1.add(purchaseButton);
		
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
}