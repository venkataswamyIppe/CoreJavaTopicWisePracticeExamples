package com.awt.programs;

import java.awt.*;

public class Testawt {
	Testawt() {
		Frame fm = new Frame(); // Creating a frame.
		Label lb = new Label("welcome to java graphics"); // Creating a label
		fm.add(lb); // adding label to the frame.
		fm.setSize(300, 300); // setting frame size.
		fm.setVisible(true); // set frame visibilty true.
		fm.setTitle("MyFrame");
	}

	public static void main(String args[]) {
		Testawt ta = new Testawt();
	}
}
