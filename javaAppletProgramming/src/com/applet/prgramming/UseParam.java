package com.applet.prgramming;

import java.applet.Applet;
import java.awt.Graphics;

public class UseParam extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		String str = getParameter("msg");
		g.drawString(str, 50, 50);
	}

}
