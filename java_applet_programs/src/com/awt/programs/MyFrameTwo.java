package com.awt.programs;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrameTwo extends Frame {
	MyFrameTwo() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setBackground(Color.red);
		this.setTitle("AWT");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args)
	{
		MyFrameTwo f=new MyFrameTwo();
	}
}

