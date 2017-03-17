package com.applet.prgramming;

import java.applet.Applet;
import java.awt.*;

public class AnimationExample extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Image picture;

	public void init() {
		picture = getImage(getDocumentBase(), "Java_logo.jpeg");
	}

	public void paint(Graphics g) {
		for (int i = 0; i < 500; i++) {
			g.drawImage(picture, i, 30, this);

			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}