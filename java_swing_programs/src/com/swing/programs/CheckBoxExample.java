package com.swing.programs;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CheckBoxExample extends JFrame {

	public CheckBoxExample() {
		JCheckBox jcb = new JCheckBox("yes"); // creating JCheckBox.
		add(jcb); // adding JCheckBox to frame.
		jcb = new JCheckBox("no"); // creating JCheckBox.
		add(jcb); // adding JCheckBox to frame.
		jcb = new JCheckBox("maybe"); // creating JCheckBox.
		add(jcb); // adding JCheckBox to frame.
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxExample();
	}

}
