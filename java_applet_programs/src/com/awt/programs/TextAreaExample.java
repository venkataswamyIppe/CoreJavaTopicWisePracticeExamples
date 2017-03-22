package com.awt.programs;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample {
	TextAreaExample() {
		Frame f = new Frame();
		TextArea area = new TextArea("Welcome to AWT.");
		area.setBounds(10, 30, 300, 300);
		f.add(area);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.green);
	}

	public static void main(String args[]) {
		new TextAreaExample();
	}
}
