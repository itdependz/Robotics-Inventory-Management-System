package com.samarth;

import javax.swing.SwingUtilities;

public class Launcher {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				addList list = new addList();
				String teamNumber = "";
				MainFrame main = new MainFrame(list, teamNumber);
				main.show();
			}
		});
	}
}