package com.samarth;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.util.*;
import java.awt.CardLayout;

public class ViewFrame {
	
	private JFrame frame;
	//public ArrayList<Product> productList = new ArrayList<Product>();
	
	
	public ViewFrame(addList list, String teamNumber) {
		initialize(list, teamNumber);
	}
	
	private void initialize(addList list, String teamNumber) {
		frame = new JFrame();
		frame.setTitle("Robotics Inventory Management System");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		 
		Page book = new Page(0);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel title = new JLabel("Product View");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Sans-serif", Font.BOLD, 36));
		title.setAlignmentX(0);
		title.setAlignmentY(0);
		
		panel.add(title);
		
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		
		JButton product1 = new JButton("No Product");
		product1.setBounds(61, 35, 115, 73);
		product1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)){
				frame.setVisible(false);
				if(book.getPage() ==0) {
				ProductView productview = new ProductView(list, list.getProduct(0), teamNumber);
				productview.show();
				}
				else {
					if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+1), teamNumber);
					productview.show();
					}
				}
				}
				
				}
			});
		panel_1.add(product1);
		
		JButton product2 = new JButton("No Product");
		product2.setBounds(321, 35, 115, 73);
		product2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(1), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+2),teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product2);
		
		JButton product3 = new JButton("No Product");
		product3.setBounds(599, 35, 115, 73);
		product3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(2), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+3), teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product3);
		
		JButton product4 = new JButton("No Product");
		product4.setBounds(61, 145, 115, 73);
		product4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(3), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+4), teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product4);
		
		JButton product5 = new JButton("No Product");
		product5.setBounds(321, 145, 115, 73);
		product5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(4), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+5), teamNumber);
					productview.show();
					}
				}
			}});
		panel_1.add(product5);
		
		JButton product6 = new JButton("No Product");
		product6.setBounds(599, 145, 115, 73);
		product6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==6) {
					ProductView productview = new ProductView(list, list.getProduct(5), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+6), teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product6);
		
		JButton product7 = new JButton("No Product");
		product7.setBounds(61, 240, 115, 73);
		product7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(6), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+7), teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product7);
		
		JButton product8 = new JButton("No Product");
		product8.setBounds(321, 240, 115, 73);
		product8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(7), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+8), teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product8);
		
		JButton product9 = new JButton("No Product");
		product9.setBounds(599, 240, 115, 73);
		product9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((product1.getText().equals("No Product")==false)) {
				frame.setVisible(false);
				if(book.getPage()==0) {
					ProductView productview = new ProductView(list, list.getProduct(8), teamNumber);
					productview.show();
				}
				else if(book.getPage()<list.size()) {
					ProductView productview = new ProductView(list, list.getProduct((book.getPage()*9)+9), teamNumber);
					productview.show();
					}
				}
			}
			});
		panel_1.add(product9);
		
		for(int j=0; j<9; j++) {
			if(j>=list.size()) {
				break;
			}
			else {
				if(j==0) {
					product1.setText(list.getProduct(0).getName());
				}
				if(j==1) {
					product2.setText(list.getProduct(1).getName());
				}
				if(j==2) {
					product3.setText(list.getProduct(2).getName());
				}
				if(j==3) {
					product4.setText(list.getProduct(3).getName());
				}
				if(j==4) {
					product5.setText(list.getProduct(4).getName());
				}
				if(j==5) {
					product6.setText(list.getProduct(5).getName());
				}
				if(j==6) {
					product7.setText(list.getProduct(6).getName());
				}
				if(j==7) {
					product8.setText(list.getProduct(7).getName());
				}
				if(j==8) {
					product9.setText(list.getProduct(8).getName());
				}
			}
		}
		
		
		
		JButton next = new JButton("Next Page");
		next.setBounds(525, 355, 112, 23);
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				book.nextPage();
				if(((book.getPage()*9)+1)<list.size()){
				product1.setText(list.getProduct((book.getPage()*9)+1).getName());
				if(product1.isEnabled()==false) {
				//product1.setEnabled(true);
				}
				}
				else {
					product1.setText("No Product");
					if(product1.isEnabled()) {
					//product1.setEnabled(false);
					}
				}
				if(((book.getPage()*9)+2)<list.size()){
				product2.setText(list.getProduct((book.getPage()*9)+2).getName());
				//product2.setEnabled(true);
				}
				else {
					product2.setText("No Product");
					//product2.setEnabled(false);
				}
				
				if(((book.getPage()*9)+3)<list.size()){
				product3.setText(list.getProduct((book.getPage()*9)+3).getName());
				//product3.setEnabled(true);
				}
				else {
					product3.setText("No Product");
					//product3.setEnabled(false);
				}
				
				if(((book.getPage()*9)+4)<list.size()){
				product4.setText(list.getProduct((book.getPage()*9)+4).getName());
				//product4.setEnabled(true);
				}
				else {
					product4.setText("No Product");
					//product4.setEnabled(false);
				}
				
				if(((book.getPage()*9)+5)<list.size()){
				product5.setText(list.getProduct((book.getPage()*9)+5).getName());
				//product5.setEnabled(true);
				}
				else {
					product5.setText("No Product");
					//product5.setEnabled(false);
				}
				
				if(((book.getPage()*9)+6)<list.size()){
				product6.setText(list.getProduct((book.getPage()*9)+6).getName());
				//product6.setEnabled(true);
				}
				else {
					product6.setText("No Product");
					//product6.setEnabled(false);
				}
				
				if(((book.getPage()*9)+7)<list.size()){
				product7.setText(list.getProduct((book.getPage()*9)+7).getName());
				//product7.setEnabled(true);
				}
				else {
					product7.setText("No Product");
					//product7.setEnabled(false);
				}
				
				if(((book.getPage()*9)+8)<list.size()){
				product8.setText(list.getProduct((book.getPage()*9)+8).getName());
				//product8.setEnabled(true);
				}
				else {
					product8.setText("No Product");
					//product8.setEnabled(false);
				}
				
				if(((book.getPage()*9)+9)<list.size()){
				product9.setText(list.getProduct((book.getPage()*9)+9).getName());
				//product1.setEnabled(true);
				}
				else {
					product9.setText("No Product");
					//product9.setEnabled(false);
				}
			}
		});
		panel_1.add(next);
		
		
		JButton back = new JButton("Back");
		back.setBounds(96, 355, 112, 23);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				HomeFrame home = new HomeFrame(list,teamNumber);
				home.show();
			}
		});
		panel_1.add(back);
		
		JButton backPage = new JButton("Last Page");
		backPage.setBounds(321, 355, 112, 23);
		panel_1.add(backPage);
		backPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book.lastPage();
				if(book.getPage()==0) {
					product1.setText(list.getProduct(0).getName());
					product2.setText(list.getProduct(1).getName());
					product3.setText(list.getProduct(2).getName());
					product4.setText(list.getProduct(3).getName());
					product5.setText(list.getProduct(4).getName());
					product6.setText(list.getProduct(5).getName());
					product7.setText(list.getProduct(6).getName());
					product8.setText(list.getProduct(7).getName());
					product9.setText(list.getProduct(8).getName());					
				}
				else {
					if(((book.getPage()*9)+1)<list.size()){
						product1.setText(list.getProduct((book.getPage()*9)+1).getName());
						product1.setEnabled(true);
						}
						else {
							product1.setText("No Product");
							product1.setEnabled(false);
						}
						if(((book.getPage()*9)+2)<list.size()){
						product2.setText(list.getProduct((book.getPage()*9)+2).getName());
						product2.setEnabled(true);
						}
						else {
							product2.setText("No Product");
							product2.setEnabled(false);
						}
						
						if(((book.getPage()*9)+3)<list.size()){
						product3.setText(list.getProduct((book.getPage()*9)+3).getName());
						product3.setEnabled(true);
						}
						else {
							product3.setText("No Product");
							product3.setEnabled(false);
						}
						
						if(((book.getPage()*9)+4)<list.size()){
						product4.setText(list.getProduct((book.getPage()*9)+4).getName());
						product4.setEnabled(true);
						}
						else {
							product4.setText("No Product");
							product4.setEnabled(false);
						}
						
						if(((book.getPage()*9)+5)<list.size()){
						product5.setText(list.getProduct((book.getPage()*9)+5).getName());
						product5.setEnabled(true);
						}
						else {
							product5.setText("No Product");
							product5.setEnabled(false);
						}
						
						if(((book.getPage()*9)+6)<list.size()){
						product6.setText(list.getProduct((book.getPage()*9)+6).getName());
						product6.setEnabled(true);
						}
						else {
							product6.setText("No Product");
							product6.setEnabled(false);
						}
						
						if(((book.getPage()*9)+7)<list.size()){
						product7.setText(list.getProduct((book.getPage()*9)+7).getName());
						product7.setEnabled(true);
						}
						else {
							product7.setText("No Product");
							product7.setEnabled(false);
						}
						
						if(((book.getPage()*9)+8)<list.size()){
						product8.setText(list.getProduct((book.getPage()*9)+8).getName());
						product8.setEnabled(true);
						}
						else {
							product8.setText("No Product");
							product8.setEnabled(false);
						}
						
						if(((book.getPage()*9)+9)<list.size()){
						product9.setText(list.getProduct((book.getPage()*9)+9).getName());
						product9.setEnabled(true);
						}
						else {
							product9.setText("No Product");
							product9.setEnabled(false);
						}
				}
			}
		});
		
		
		
	}
		
	
	public void show() {
		frame.setVisible(true);
		}
}