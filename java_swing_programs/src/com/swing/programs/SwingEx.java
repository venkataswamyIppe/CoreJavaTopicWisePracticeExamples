package com.swing.programs;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx {
	JFrame jf;
	public SwingEx() {
		jf = new JFrame("MyWindow"); // Creating a JFrame with name MyWindow.
		JButton btn = new JButton("Say Hello"); // Creating a Button.
		jf.add(btn); // adding button to frame.
		jf.setLayout(new FlowLayout()); // setting layout using FlowLayout object.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting close operation.
		jf.setSize(400, 400); // setting size
		jf.setVisible(true); // setting frame visibilty
	}

	public static void main(String[] args) {
		new SwingEx();
	}

}
