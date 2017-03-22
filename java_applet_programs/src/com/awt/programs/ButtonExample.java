package com.awt.programs;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
	public static void main(String[] args) {
		Frame f = new Frame("Button Example");
		final TextField tf = new TextField();
		tf.setBounds(50, 50, 150, 20);
		Button b = new Button("Click Here");
		b.setBounds(50, 100, 60, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to AWT Example.");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.green);
	}

}
