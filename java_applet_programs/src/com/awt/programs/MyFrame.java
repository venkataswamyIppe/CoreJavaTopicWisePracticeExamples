package com.awt.programs;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame extends Frame {

	MyFrame() {
		this.setSize(400, 500);
		this.setVisible(true);
		this.setTitle("myframe");
		this.addWindowListener(new MyFrameImpl());
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}

class MyFrameImpl implements WindowListener {
	public void windowActivated(WindowEvent e) {
		System.out.println("window activated");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("window deactivated");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("window iconified");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("window deiconified");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("window closed");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("window Opened");
	}
}
