package com.awt.programs;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceEventExample {
	ChoiceEventExample() {
		Frame f = new Frame();
		final Label label = new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400, 100);
		Button b = new Button("Show");
		b.setBounds(200, 100, 50, 20);
		final Choice c = new Choice();
		c.setBounds(100, 100, 75, 75);
		c.add("C");
		c.add("C++");
		c.add("Java");
		c.add("PHP");
		c.add("Android");
		f.add(c);
		f.add(label);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.green);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Programming language Selected: "
						+ c.getItem(c.getSelectedIndex());
				label.setText(data);
				label.setBackground(Color.cyan);
			}
		});
	}

	public static void main(String args[]) {
		new ChoiceEventExample();
	}
}
