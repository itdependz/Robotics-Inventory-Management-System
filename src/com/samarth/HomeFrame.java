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

public class HomeFrame {
	
	private JFrame frame;
	//public ArrayList<Product> productList = new ArrayList<Product>();
	
	public HomeFrame(addList list, String teamNumber) {
		initialize(list, teamNumber);
	}
	
	private void initialize(addList list, String teamNumber) {
		frame = new JFrame();
		frame.setTitle("Robotics Inventory Management System");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel title = new JLabel("Home");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Sans-serif", Font.BOLD, 36));
		title.setAlignmentX(0);
		title.setAlignmentY(0);
		
		panel.add(title);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JButton add = new JButton("Add\r\n");
		add.setBounds(65, 150, 156, 84);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AddFrame add = new AddFrame(list, teamNumber);
				add.show();
			}
		});
		panel_1.setLayout(null);
		panel_1.add(add);
		
		JButton view = new JButton("View Products");
		view.setBounds(318, 150, 175, 84);
		panel_1.add(view);
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewFrame view = new ViewFrame(list, teamNumber);
				view.show();
			}
		});
		
		JButton back = new JButton("Logout");
		back.setBounds(585, 150, 143, 84);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				list.clear();
				MainFrame main = new MainFrame(list, teamNumber);
				main.show();
			}
		});
		panel_1.add(back);
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
}