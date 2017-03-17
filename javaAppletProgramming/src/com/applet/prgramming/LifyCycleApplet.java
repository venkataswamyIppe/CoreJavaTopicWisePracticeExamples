package com.applet.prgramming;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class LifyCycleApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String s = " ";

	public void init() {
		s = s + "int";
	}

	public void start() {
		s = s + "start";
	}

	public void stop() {
		s = s + "stop";
	}

	public void destroy() {
		s = s + "destroy";
	}
	
	public void paint(Graphics g){
		Font f=new Font("Arial", Font.BOLD, 20);
		g.setFont(f);
		g.drawString(s, 100, 100);
	}
}
