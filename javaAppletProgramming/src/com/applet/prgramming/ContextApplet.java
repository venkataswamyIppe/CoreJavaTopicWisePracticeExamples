package com.applet.prgramming;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ContextApplet extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Button b;

	public void init() {
		b = new Button("Click");
		b.setBounds(50, 50, 60, 50);

		add(b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		AppletContext ctx = getAppletContext();
		Applet a = ctx.getApplet("app2");
		a.setBackground(Color.yellow);
	}
}
