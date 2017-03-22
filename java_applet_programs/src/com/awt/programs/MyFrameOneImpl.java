package com.awt.programs;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrameOne extends Frame {

	MyFrameOne() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setBackground(Color.red);
		this.setTitle("AWT");
		this.addWindowListener(new Listenerimpl());
	}

}

class Listenerimpl extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

public class MyFrameOneImpl {
	public static void main(String[] args) {
		MyFrameOne f = new MyFrameOne();
	}
}
