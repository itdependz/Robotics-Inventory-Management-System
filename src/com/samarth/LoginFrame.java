package com.samarth;

import java.awt.Color;
import java.util.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.*;


public class LoginFrame {
	private JFrame frame;
	public String teamNum;
	
	public LoginFrame(addList list) {
		initialize(list);
	}
	
	public void initialize(addList list) {
		String productName = "";
        int quantity = 0;
        String link = "";
        int counter=1;
		frame = new JFrame();
		frame.setTitle("Robotics Inventory Management System");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		frame.getContentPane().add(panel);
		
		panel.setBackground(Color.WHITE);
		
		JLabel title = new JLabel("Login");
		title.setFont(new Font("Sans-serif", Font.BOLD, 36));
		panel.add(title);
		
		JPanel loginLabelPanel = new JPanel();
		loginLabelPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200, 10));
		panel.add(loginLabelPanel);
		
		JLabel teamNumberLabel = new JLabel("Team Number");
		teamNumberLabel.setFont(new Font("Sans-serif", Font.PLAIN, 12));
		loginLabelPanel.setBackground(Color.WHITE);
		loginLabelPanel.add(teamNumberLabel);
		
		JPanel textBoxPanel = new JPanel();
		textBoxPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		//loginLabelPanel.add(textBoxPanel);
		
		
		JTextField teamNumber = new JTextField(5);
		//teamNumber.setBackground(Color.GRAY);
		teamNumber.setToolTipText("Enter your Team Number ex.9999");
		loginLabelPanel.add(teamNumber);
		
		JPanel submitPanel = new JPanel();
		submitPanel.setLayout(new GridLayout(1,2));
		loginLabelPanel.add(submitPanel);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Sans-serif", Font.PLAIN, 12));
		submit.setPreferredSize(new Dimension(100,100));
		submit.setToolTipText("Submit");
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(teamNumber.getText());
				//create folder and inside the folder will be all the products
				String productName = "";
				int counter  = 1;
				int quantity = 0;
				String link = "";
				//create the folder
				File file  = new File("C:/Users/samar/eclipse-workspace/roboticsinventorymanagementsystem/src/com/samarth/secrets/" + teamNumber.getText() +"Database.csv");
				if(file.exists()==false) {
				System.out.println("if");
				teamNum = teamNumber.getText();
				//file.mkdir();
				//creates csv
				File csv = new File("C:/Users/samar/eclipse-workspace/roboticsinventorymanagementsystem/src/com/samarth/secrets/" + teamNumber.getText() + "Database.csv");
				try {
					csv.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try(FileWriter writer = new FileWriter("C:/Users/samar/eclipse-workspace/roboticsinventorymanagementsystem/src/com/samarth/secrets/" + teamNumber.getText() +"Database.csv")){
					writer.write("Product,Quantitiy,Link\n");
					} catch(Exception e1) {
						
					}
				}
				else {
					System.out.println("else");
					try {
						 BufferedReader reader = new BufferedReader(new FileReader("C:/Users/samar/eclipse-workspace/roboticsinventorymanagementsystem/src/com/samarth/secrets/" + teamNumber.getText() +"Database.csv"));
						 String line = reader.readLine();
						 line = reader.readLine();
						 System.out.println(line);
						 System.out.println("in try");

						 while (line != null) {
							//System.out.println(line);
							 if(counter==1){
							        productName = line.substring(0,line.indexOf(','));
							        line = line.substring(line.indexOf(',')+1,line.length());
							        counter++;
							        System.out.println("line: " + line);
							 }
							 if(counter==2){
							        quantity = Integer.parseInt(line.substring(0,line.indexOf(',')).replace(" ",""));
							        line = line.substring(line.indexOf(',')+1, line.length());
							        counter++;
							       System.out.println("line2: " + line);
							 }
							 if(counter==3){
							        link = line.replace(" ", "");
							        counter=1;
							        Product newProduct = new Product(productName, 0.0, quantity, link, true);
							        list.add(newProduct);
							        System.out.println(newProduct.getName());
						        	// read next line
							        line = reader.readLine();
							 }
							 
						 }

						 reader.close();
					} 
						catch (IOException e1) {
							e1.printStackTrace();
						}
				}
				//send to home page frame
				frame.setVisible(false);
				HomeFrame home = new HomeFrame(list, teamNumber.getText());
				home.show();
				}
			});
		submitPanel.add(submit);
		
		JButton back = new JButton("Back");
		back.setFont(new Font("Sans-serif", Font.PLAIN, 12));
		back.setPreferredSize(new Dimension(100,100));
		back.setToolTipText("Go Back");
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainFrame main = new MainFrame(list, teamNumber.getText());
				main.show();
				}
			});
		submitPanel.add(back);
		
		
		
		
		
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
}