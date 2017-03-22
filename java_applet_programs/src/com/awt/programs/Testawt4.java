package com.awt.programs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class Testawt4 extends Frame {

	public static void main(String[] args) {
		Testawt4 t = new Testawt4();
		t.setVisible(true);
		t.setSize(500, 500);
		t.setTitle("myframe");
		t.setBackground(Color.cyan);
	}

	public void paint(Graphics g) {
		Font f = new Font("arial", Font.ITALIC, 25);
		g.setFont(f);
		g.drawString("hi venkat how are you", 100, 100);
	}

}
