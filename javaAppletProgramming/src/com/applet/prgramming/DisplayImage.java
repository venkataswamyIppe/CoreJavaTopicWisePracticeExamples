package com.applet.prgramming;

import java.applet.*;
import java.awt.*;

public class DisplayImage extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Image img;

	public void init() {
		img = getImage(getDocumentBase(), "Java_logo.jpeg");
	}

	public void paint(Graphics g) {

		g.drawImage(img, 100, 100,this);

	}
}
