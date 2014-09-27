package com.rp.observer.swing;

import javax.swing.JFrame;

public class Sistema extends JFrame {
	
	public Sistema() {
		initUI();
	}
	
	private void initUI() {
		
	}
	
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		sistema.setSize(800,600);
		sistema.setVisible(true);
	}
}
