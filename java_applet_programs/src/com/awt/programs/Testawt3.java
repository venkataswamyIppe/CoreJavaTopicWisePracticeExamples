package com.awt.programs;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Testawt3 extends Frame {
	public Testawt3() {

		Button btn = new Button("Hello World");
		add(btn); // adding a new Button.
		setSize(400, 500); // setting size.
		setTitle("MyFrame"); // setting title.
		setLayout(new FlowLayout()); // set default layout for frame.
		setVisible(true); // set frame visibilty true.
		setBackground(Color.green);
	}

	public static void main(String[] args) {
		Testawt3 ta = new Testawt3(); // creating a frame.
	}
}
