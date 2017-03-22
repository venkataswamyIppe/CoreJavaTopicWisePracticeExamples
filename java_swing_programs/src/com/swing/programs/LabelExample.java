package com.swing.programs;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LabelExample extends JFrame {

	public LabelExample() {
		setTitle("MyWindow");
		JLabel lb = new JLabel("Welcome to My Lable Window"); // Creating a
																// label.
		add(lb); // adding label to frame.
		setLayout(new FlowLayout()); // setting layout using FlowLayout object.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting close
														// operation.
		setSize(400, 400); // setting size
		setVisible(true); // setting frame visibilty
	}

	public static void main(String[] args) {
		new LabelExample();
	}

}
