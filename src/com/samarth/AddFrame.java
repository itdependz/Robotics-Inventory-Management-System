package com.samarth;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;

public class AddFrame {
	private JFrame frame;
	private JTextField productField;
	private JTextField quantityField;
	private JTextField textField;
	
	public AddFrame(addList list, String teamNumber) {
		initialize(list, teamNumber);
	}
	
	private void initialize(addList list, String teamNumber) {
		frame = new JFrame();
		frame.setTitle("Robotics Inventory Management System");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Add a Product");
		title.setBounds(270, 5, 245, 47);
		title.setFont(new Font("Sans-serif", Font.BOLD, 36));
		panel.add(title);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 61, 735, 391);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel product = new JLabel("Product Name");
		product.setHorizontalAlignment(SwingConstants.CENTER);
		product.setBounds(234, 45, 107, 55);
		panel_1.add(product);
		
		JLabel link = new JLabel("Link");
		link.setHorizontalAlignment(SwingConstants.CENTER);
		link.setBounds(271, 219, 80, 55);
		panel_1.add(link);
		
		productField = new JTextField();
		productField.setBounds(351, 62, 96, 20);
		panel_1.add(productField);
		productField.setColumns(10);
		
		quantityField = new JTextField();
		quantityField.setColumns(10);
		quantityField.setBounds(351, 150, 96, 20);
		panel_1.add(quantityField);
		
		JButton add = new JButton("Add Product");
		add.setBounds(301, 304, 114, 23);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create product and add to list
				Product newProduct = new Product(productField.getText(), 0.0, Integer.parseInt(quantityField.getText()), textField.getText(), true);
				list.add(newProduct);
				//add product to csv
				try(FileWriter writer = new FileWriter("C:/Users/samar/eclipse-workspace/roboticsinventorymanagementsystem/src/com/samarth/secrets/" + teamNumber +"Database.csv",true)){
					
					writer.write(productField.getText()+","+quantityField.getText()+","+textField.getText()+"\n");
					} catch(Exception e1) {
						
					}
				//Switch back to home
				frame.setVisible(false);
				HomeFrame home = new HomeFrame(list, teamNumber);
				home.show();
				list.showProducts();
			}
		});
		panel_1.add(add);
		
		JLabel quantity_1 = new JLabel("Quantity");
		quantity_1.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_1.setBounds(271, 133, 80, 55);
		panel_1.add(quantity_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(351, 236, 96, 20);
		panel_1.add(textField);
		
		
		
		
	}

	public void show() {
		frame.setVisible(true);
	}
}